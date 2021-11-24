package javacodechecker;

public class MissingBreakStatementInSwitch {

    public void Statement(){
        int day = 2;
        int n =2;
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH
        switch (day){

            case 1:
                logger.info("1");
                break;

            case 2:
                logger.info("2");

            case 3:
                logger.info("3");
                break;

            default:
                logger.info("4");

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH
        switch (n){

            case 1:
                logger.info("1");
                break;

            case 2:
                logger.info("2");

            default:
                logger.info("4");

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH/no-detect
        switch (n){

            case 1:

            case 2:
                logger.info("2");

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH/no-detect
        switch (n){

            case 1:
            case 2:
            case 3:
            case 4:
                logger.info("2");
                break;

            default:
                logger.info("4");

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH
        switch (n){

            default:
                logger.info("4");
            case 1:
            case 2:
            case 3:
            case 4:
                logger.info("2");
                break;

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH/no-detect
        switch (n){

            case 1:
            case 2:
            case 3:
            case 4:
                logger.info("2");
                break;

            default:
                logger.info("4");

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH
        switch (n){

            case 1:
            case 2:
            case 3:
            case 4:
                logger.info("2");

            default:
                logger.info("4");

        }
        double returnValue = DemoMethod(3);
    }


    public double DemoMethod(int n){
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH/no-detect
        switch (n){

            case 1:
            case 2:
                return 2.0;
            case 3:
                return 3.0;
            case 4:
                logger.info("4");
                return 4.0;
            default:
                logger.info("5");
                return 5.0;

        }
        // EMB-ISSUE: CodeIssueNames.MISSING_BREAK_STATEMENT_IN_SWITCH
        switch (n){

            case 1:
            case 2:
                return 2.0;
            case 3:
                return 3.0;
            case 4:
                logger.info("4");

            default:
                logger.info("5");
                return 5.0;

        }
    }


}