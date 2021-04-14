package Day4;

//A class can inherit only one class multiple inheritance is not possible
// but a class can implements more than one interface

public class Demo4 {
public static void main(String[] args) {
	Child ch = new Child();
	ch.m1();
	ch.m2();
}
}

interface IParent1{
	void m1();
}
interface IParent2{
	void m2();
}
class Child implements IParent1,IParent2{
	@Override
	public void m1() {
		System.out.println("Interface");
	}
	@Override
	public void m2() {
		System.out.println("Interface");
	}
}