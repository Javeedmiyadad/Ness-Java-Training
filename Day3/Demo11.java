package Day3;

public class Demo11 {
	public static void main(String [] args) {
		child ch = new child(10);
		
	}

}

class parent{
	public parent(int x) {
		System.out.println("this is parent " + x);
	}
}

class child extends parent{
	public child(int a)
	{
		super(a);
		System.out.println("this is child ");
	}
}
