package com.acellere.corona.javacodechecker.ci.checkers;

import com.acellere.corona.cmx.mod.cmn.Severity;
import com.acellere.corona.cmx.msg.data.auxmod.CodeIssueModel;
import com.acellere.corona.commons.cast.ObjCaster;
import com.acellere.corona.javaparsercore.ParseContext;
import com.acellere.corona.javaparsercore.ci.ICodeIssuePublisher;
import com.acellere.corona.javaparsercore.exceptions.ParserException;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.*;

import java.util.List;


public class MissingBreakStatementInSwitch extends BaseChecker{

    @Override
    protected void handleVisit(Node node, ParseContext context, ICodeIssuePublisher codeIssuePublisher) throws ParserException {
        if(node instanceof SwitchStmt){
            SwitchStmt switchStmt = ObjCaster.castNode(SwitchStmt.class,node);
            List<SwitchEntryStmt> entries = switchStmt.getEntries();
            if(entries != null){
                CheckingEntriesInSwitch(entries,node,context,codeIssuePublisher);
            }
        }
    }

    private void CheckingEntriesInSwitch(List<SwitchEntryStmt> entries, Node node, ParseContext context, ICodeIssuePublisher codeIssuePublisher){
        for(SwitchEntryStmt switchEntryStmt:entries){
            int index = entries.indexOf(switchEntryStmt);
            if(!(switchEntryStmt.getStmts().isEmpty()) && index != entries.size()-1){
                List<Statement> statements = switchEntryStmt.getStmts();
                for(Statement statement:statements){
                    int indexOfStmt = statements.indexOf(statement);
                    if(!(statement instanceof BreakStmt) && (indexOfStmt == statements.size()-1) && !(statement instanceof ReturnStmt)){
                        publishCodeIssue(node, context, codeIssuePublisher);
                    }
                }

            }
        }
    }

    private void publishCodeIssue(Node node, ParseContext context, ICodeIssuePublisher codeIssuePublisher) {
        codeIssuePublisher.publish(new CodeIssueModel(context.getCu().getCuFile(), node.getRange().begin.line,
                Severity.medium, "Missing Break Statement In Switch", CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH));
    }
}
