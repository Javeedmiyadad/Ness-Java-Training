package Day3;

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
//	public int age;                                      //There is a repetation in the code so we use inheritance use extends in java for inheritance
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
