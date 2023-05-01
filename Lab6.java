package myexception2;

public class Lab6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } 
        catch (ArithmeticException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            for (int i = 0; i < stackTraceElement.length; i++) {
                System.out.println(stackTraceElement[0].getClassName());
                System.out.println(stackTraceElement[0].getMethodName());
                System.out.println(stackTraceElement[0].getFileName());
                System.out.println(stackTraceElement[0].getLineNumber());
            }
        }
    }
}
