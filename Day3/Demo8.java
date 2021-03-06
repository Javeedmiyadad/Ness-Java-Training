package Day3;

/**
 * Static and non static class members
 * When a class member include a static keyword that member is called static
 * When no static keyword is used is called non static
 *
 * Static members are invoke using class name where as instance members are
 * invoke using class object or instance
 *
 * */
public class Demo8 {
	public static void main (String[] args) {
	Calculator calc = new Calculator();
	calc.addNumber(20, 10);
	calc.subNumber(20, 10);
	Calculator.mulNumber(20, 10);
	Calculator.divNumber(20, 10);
}
}

class Calculator {
	
	public void addNumber(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void subNumber(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	public static void mulNumber(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void divNumber(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
