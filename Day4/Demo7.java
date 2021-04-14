package Day4;

/**
 * Encapsulation
 * It is all about wrapping your code into single unit
 * With the help of encapsulation we can decide what level visibility we would like to provide to the class members
 *
 * Type of modifiers
 * 1. Access Modifiers
 * 2. Non Access Modifiers
 *
 * There are 4 access modifiers
 * 1. private - It cannot be access outside the class
 * 2. public - access level public means visible or accessable to everywhen everywhere
 * 3. protected -  within the package and outside the package through child class
 * 4. default - only with in a same package
 *
 * */


//public class Demo7 {
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.id = 1;
//		d.name = "javeed";
//		d.marks = 100;
//		
//		System.out.println("Student: Id = " + d.id + ", Name = "+ d.name + ", Marks = " + d.marks);
//	}
//
//}
//class Demo{
//	public int id;
//	public String name;
//	public int marks;
//}

//if we make it private then we have to set the getter and setter 

public class Demo7 {
	public static void main(String[] args) throws Exception{
		Demo d = new Demo();
		d.setId(1);
		d.seName("javeed");
		
		System.out.println("Student: Id = " + d.getId() + ", Name = "+ d.getName() + ", Marks = " + d.getMarks());
	}
}
//

class Demo{
	private int id;
	private String name;
	private int marks = 80;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if(id < 0) {
			throw new Exception ("id cannot be less than 0");
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void seName(String name) throws Exception {
		if(name.isEmpty()) {
			throw new Exception ("Name cannot be empty");
		}
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	
}
