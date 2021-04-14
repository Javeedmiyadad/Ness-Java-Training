package Day4;


//An interface can inherit multiple interfaces or it can inherit only one interface
public class Demo3 {
	public static void main (String[] args) {
		Test1 tst = new Test1();
		tst.m1();
		tst.m2();
		tst.m3();
	}

}

interface ITest1{
	void m1();
}

interface ITest2{
	void m2();
}

interface ITest3 extends ITest1, ITest2{
	void m3();
}

class Test1 implements ITest3{
	
	@Override
	public void m1() {
		System.out.println("Inteface");
	}
	@Override
	public void m2() {
		System.out.println("Inteface");
	}
	@Override
	public void m3() {
		System.out.println("Inteface");
	}
}