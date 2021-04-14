package Day4;


/**
 * Exception
 * It is an event which occurs during the execution of a program that cause the application or program to
 * terminate inappropriately
 *
 * Exception Handling
 * It is all about handling these exception gracefully
 *
 * We can handle the exception using
 * 1. try - any risky
 * 2. catch - will have exception handling code
 * 3. finally - will executed no matter exception occur or not
 * 4. throw - when we need to throw the exception manually
 * 5. throws
 *
 * Exception can be divided into 3 main categories
 * 1. Check Exception
 * 2. Runtime / Unchecked Exception
 * 3. Errors
 *
 * Checked Exception
 * Are the exception which get checked at compile time
 * eg: IOException, SQLException
 *
 * Unchecked / Runtime Exception
 * Are not checked at compile time but they are checked at runtime
 * eg: NUllPointerException
 *
 * Errors
 * As beyond the developer control, also irrecoverable
 * eg OutOfMemoryError, VirtualMachineError, StackOverflow
 *
 * throw
 * throw is a keyword we can use to handle the exception manually
 * when we want to take the responsibility to create the object of the exception class
 * we can use throw keyword with system define exception classes or with use define exception classes
 *
 * Important:
 * > Every class cannot be throw
 * > It should be throwable
 * > Only exception class can be thrown
 * > we can create a class which extend from RunTimeException, throwable, exception class
 *
 * # throw vs throws
 *
 *
 *
 * */

public class Demo9 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 1;

        try{
            c = a / b;
        }
//        catch (ArithmeticException ex){
//            //System.out.println(ex.getMessage());
//            System.out.println("Please provide number greater than 0");
//        }
        catch (Exception ex){
            //System.out.println(ex.getMessage());
        	System.out.println("Please provide number greater than 0");
        }


        System.out.println("Result: "+ c);
    }
}
