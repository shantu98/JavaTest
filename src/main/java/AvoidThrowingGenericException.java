package javacodechecker;

public class AvoidThrowingGenericException {
    
    public void M1()throws Exception{
        logger.info("Throwing generic exception");
    }
    
    public void M2()throws Throwable{
        logger.info("Throwing generic exception");
    }
    
    public void M3()throws  InvocationTargetException{
        logger.info("Throwing InvocationTargetException");
    }

   
    public void M5()throws IOException, InvocationTargetException, SQLException{
        logger.info("Throwing IOException, InvocationTargetException, SQLException");
    }
}
