package Day3;

public class Demo9 {
	
	public static void main(String [] args) {
		Student.print();
		
	}

}

 class Student{
	
	public static String name;
	public static String email;
	public static int id;
	
	static {   //static block supported in java
		name ="javeed";
		email = "j@gmail.com";
		id = 10;
	}
	public static void print() {
		System.out.println(" Name :"+ name + ", Email :"+ email+ ", Id :"+ id);
	}
}
