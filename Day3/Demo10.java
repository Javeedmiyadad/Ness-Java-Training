package Day3;


/**
 * OOPs - Object Oriented Programming
 * 4 main pillers  / principal of OOPs
 * 1. Inheritance
 * 2. Polymorphism
 * 3. Abstraction
 * 4. Encapsulation
 *
 * Inheritance
 * > It is a mechanism of consuming the members of one class in another class by
 *   eastablishing prent/ child class relationship between the class
 * > encourage code re-usability
 *
 * Employee => Parent / Base / Super
 * FTE => Child / Derived/ sub
 *
 * > In inheritance child class can consume members of its parent as it is owner of those
 *   members (except the private member of the parent class)
 *
 * > Parent class constructor must be accessaible to the child class otherwise inheritance will not be possible
 *
 * > In inheritance child class can access parent class members but parent class can never access any member that define
 *   in child class
 *
 *  Advantage
 * 1. Code resuability
 * 2. Reduce Error
 * 3. Reduce Time
 * 4. More Maintanable Code
 *
 *
 * Type of Inheritance
 * 1. Simple / Single
 * 2. MultiLevel
 * 3. Hierarchical
 * 4. Multiple
 * 5. Hybrid
 *
 * */

public class Demo10 {
	
	public static void main (String [] args) {
		
	fullTimeEmployee fte = new fullTimeEmployee();
		fte.FirstName = "Javeed";
	    fte.LastName = "miyadad";
	    fte.AnnualSalary = 25000;
	    System.out.println( "Salary : " + fte.AnnualSalary );
		fte.getFullName();
		partTimeEmployee pte = new partTimeEmployee();
		pte.FirstName = "suhana";
		pte.LastName = "heena";
		pte.HourlySalary = 15000;
		System.out.println( "Salary : " + pte.HourlySalary );
		pte.getFullName();
		
//		Employees emp = new Employees();
//		emp.FirstName = "javeed";
//		emp.LastName = "miyadad";
//		emp.print();
	}

}

class Employees{
	
	public String FirstName;
	public String LastName;
	public String email;
	public int id;
	public int age;
	
 public void getFullName() {
		
		System.out.println(FirstName + " " + LastName );
	}
  
}

class fullTimeEmployee extends Employees{
	
//	public String FirstName;
//	public String LastName;
//	public String email;
//	public int id;
//	public int age;                   //There is a repetation in the code so we use inheritance use extends in java for inheritance
	public int AnnualSalary;
	
//	public void print() {
//		
//		System.out.println(FirstName + " " + LastName );
//	}
}

class partTimeEmployee extends Employees{
	
//	public String FirstName;
//	public String LastName;
//	public String email;
//	public int id;
//	public int age;
	public int HourlySalary;
	
//	public void print() {
//		
//		System.out.println(FirstName + " " + LastName );
//	}
}
