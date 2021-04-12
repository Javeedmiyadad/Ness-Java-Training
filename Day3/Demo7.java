package Day3;

public class Demo7 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("javeed","j@gmail.com", 1);
		Employee emp2 =new Employee();
		emp2.name ="javeed";
		emp2.email="j@gmail.com";
		emp2.id= 1;
		
		emp1.print();
		emp2.print();
	}

}

class Employee{
	public String name;
	public String email;
	public int id;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Employees:Name ="+ name +", Email ="+ email + ", Id = "+ id);
	}
	
}
