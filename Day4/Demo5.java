package Day4;

//by using "default" keyword in the body of interface containing a method we can write like normal method

public class Demo5 {
	public static void main (String[] args) {
		Company cmp = new Company();
		cmp.employeeName();
		cmp.compantName();
	}

}

interface ICompany{
	void employeeName();
	 default void compantName() {
		 System.out.println("Ness Technologies");
	 };
}

class Company implements ICompany{
	
	@Override
	public void employeeName(){
		System.out.println("Javeed");
	}
}
