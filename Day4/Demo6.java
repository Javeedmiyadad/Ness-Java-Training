package Day4;

// we can also implement the interface which is present inside the class by using classname.interface name

public class Demo6 {
	public static void main(String[] args) {
		someClass2 cls = new someClass2();
		cls.m1();
		cls.m2();
	}

}
class someClass{
	interface I1{
		void m1();
	}
	interface I2{
		void m2();
	}
}
class someClass2 implements someClass.I1,someClass.I2{
	@Override
	public void m1() {
		System.out.println("interface");
	}
	@Override
	public void m2() {
		System.out.println("interface");
	}
}