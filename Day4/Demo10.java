package Day4;

public class Demo10 {
	public static void main(String[] args) throws Exception {
//		ArithmeticException ex = new ArithmeticException();
//		throw ex;
//		throw new ArithmeticException();
		throw new testException();
	}

}
class testException extends Exception{
	
}
