package Day5;

/**
 * Null PointerException
 *
 * RuntimeException -> Exception -> Throwable
 *
 *
 * **/

class Employee{
    public void display(){
        System.out.println("display...");
    }
}

public class Demo4 {
	public static void main(String[] args) {
		
		String name ="javeed";
		System.out.println(name.length());
		
		String str = null;
		try
		{
		System.out.println(str.length());
		}
		catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}
		
		Employee emp = new Employee();
		emp.display();
		Employee emp1 = null;
		try {
		emp1.display();
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
