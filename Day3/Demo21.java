package Day3;

public class Demo21 {
	public static void main(String[] args) {
		Child3 ch = new Child3();
		Super s = new Child2();
		System.out.println(s.name);//using super class object reference
		ch.m1();// using Subclass object reference
		System.out.println(ch.name);//it prints Child1 class variable data
		ch.m2();//this method prints the name present in super class using super keyword in method m2
		
	}

}


abstract class Super {
	
	 String name = "javeed";
	public abstract void m1();
}
 
 class Child2 extends Super {
	 @Override
	 public void m1() {
		 System.out.println("Sub class object reference");
	 }
 }
class Child3 extends Child2{
	 String name = "Ashwini";
	public void m2() {
		System.out.println(super.name);
	}
	
}