package Day5;

/***
 * # Top 10 Exception
 * 1. NullPointerException
 * 2. ArrayIndexOutOfBoundException
 * 3. StackOverFlowException
 * 4. ClassCastException
 * 5. IllegalArgumentException
 * 6. NumberFormatException
 * 7. IllegalStateException
 * 8. NoClassDefFoundException
 * 9. AssertException
 * 10. ArithmaticException
 *
 */

public class Demo1 {
	public static void main(String[] args) {
		try {
			doSomeThing();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void doSomeThing() throws Exception {
		doSomeThingElse();
	}
	public static void doSomeThingElse() throws Exception {
		doSomeThingSomeThingElse();
	}
    public static void doSomeThingSomeThingElse() throws Exception {
    	throw new Exception();
    }
}
