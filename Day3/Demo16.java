package Day3;

/**
 * Method Overriding
 * > Method overriding is used to provide the specific implementation of a method which is already provided by super class
 * > If child class is not happy with the implementation of the parent class then it can override
 * > Method overriding is used for runtime polymorphism
 * > In this case we define multiple methods with the same name and same signature (parameters)
 * > This can be performed only between parent and child class and never can be performed with in class
 * > Overriding is all about changing the behaviour of the method
 *
 * */

public class Demo16 {
	public static void main(String [] args) {
		fullTimeEmployee2 emp = new fullTimeEmployee2();
		partTimeEmployee2 emp1 = new partTimeEmployee2();
		emp.FirstName = "javeed";
		emp.LastName = "miyadad";
		
		emp1.FirstName = "suhana";
		emp1.LastName = "heena";
		
		emp.getFullName();
		emp1.getFullName();
		
	}

} //we have to override the parent method by child method by using override keyword
  // in java it is not possible to override in the same class here there is no virtual keyword

class Employee4{
	public String FirstName;
	public String LastName;
	
	public void getFullName() {
		System.out.println(FirstName +" " + LastName);
	}
}
class fullTimeEmployee2 extends Employee4{
	
	@Override
	public void getFullName() {
		System.out.println(FirstName +" " + LastName + " --overrided fulltime employee");
	}
	
	
}
class partTimeEmployee2 extends Employee4{
	@Override
	public void getFullName() {
		System.out.println(FirstName +" " + LastName + " --overrided parttime employee");
	}
	
	
}
 