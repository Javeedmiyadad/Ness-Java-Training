package Day3;

/**
 * Abstraction
 * > One of the main pillar of the OOPs
 * > A class which declare with abstract keyword is know as abstract class
 * > Abstract class can contain abstract as well as non abstract method
 * > Abstract method are method without the method body
 * > Only the abstract class can contain the abstract methods
 * > Abstract class consider as incomplete hence we cannot able to create instance of the abstract class
 * > Abstract class can always be super class
 * > The class which derived from the abstract class responsable to provide the implementation of all abstract methods
 * > A non abstrac class derived from the abstract class must provide the implementation of all abstract method
 * > Abstract method cannot have body or implementation and we try to do so it will be an compile time error
 * > Only abstract class can contain abstract method
 *
 * */

public class Demo18 {
	public static void main (String[] args) {
		
		childDemo child = new childDemo();
		child.addNum(20, 10);
		child.subNum(20, 10);
		child.mulNum(20, 10);
		child.divNum(20, 10);
	}
	

}

 abstract class abstractDemo{
	
	public void addNum(int num1, int num2) {
		System.out.println("Addition : "+ (num1 + num2));
	}
	public void subNum(int num1, int num2) {
		System.out.println("Substraction : "+ (num1 - num2));
	}
	public abstract void mulNum (int num1, int num2);   //Abstract method 
	public abstract void divNum (int num1, int num2);   //Abstract method 
}
class childDemo extends abstractDemo{
	
	@Override
	public void mulNum (int num1, int num2) {
		System.out.println("Multiplication : "+ (num1 * num2));
	}                      //we should implement abstract method in the child class in thet it inherits
	@Override
	public void divNum (int num1, int num2) {
		System.out.println("Division : "+ (num1 / num2));
	}
	
	
}