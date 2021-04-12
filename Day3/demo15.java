package Day3;

public class demo15 {
	public static void main(String[] args) {
		method2 max = new method2();
		max.m1();
		max.m1(10);
	}

}    //method overloading with inheritance or between parent and child class

class method1{
	public void m1() {
		System.out.println("method 1");
	}
}
class method2 extends method1{
	public void m1(int x) {
		System.out.println("method 2");
	}
}
