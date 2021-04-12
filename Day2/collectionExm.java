package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collectionExm {
	
	public static void main(String[] args) {
		
		
//		 * Collection framework in java that provides an architecture to store and
//		 * to manipluate the group of object
//		 *
//		 * We can perform various operation like sorting, searching, inserting, deleting and manipulating
//		 *
//		 * Collection consist for various interfaces and classes
//		 * interface: Set, Queue, List etc
//		 * class: Vector, ArrayList, LinkedList, HashTable, HashSet, TreeSet etc
		
		
		
//		 * ArrayList
//		 * 1. non synchronized
//		 * 2. can contain duplicate elements
//		 * 3. maintain insertion order
//		 * 4. might slow while manipulating data
//       ArrayList -> AbstractList -> List -> Collection -> Iterable
		
		
		class Employee{
		    public int empId;
		    public String name;
		    public int age;

		    public Employee(int empId, String name, int age){
		        this.empId = empId;
		        this.name = name;
		        this.age = age;
		    }
		}
	

		 // creating array list
		
		ArrayList <String> list = new ArrayList<>();
		list.add("javeed");
		list.add("Suhana");
		list.add("Jareena");
		
		
		System.out.println(list);
		
		// using for each
		for (String lists : list) {
			System.out.println(lists);
		}
		
		//using for loop
		for(int i= 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Traversing list through iterator
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//get
		System.out.println(list.get(0));
		
		//set
		list.set(0, "javmiya");
		System.out.println(list.get(0));
		
		//sorting
		System.out.println("Before sorting---");
		for (String lists : list) {
			System.out.println(lists);
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		System.out.println("After sorting---");
		for (String lists : list) {
			System.out.println(lists);
		}
		
		  ArrayList<Employee> employees = new ArrayList<>();
	        Employee emp1 = new Employee(1, "mark", 20);
	        Employee emp2 = new Employee(2, "paul", 20);
	        Employee emp3 = new Employee(3, "watson", 20);
	        employees.add(emp1);
	        employees.add(emp2);
	        employees.add(emp3);

	        for(Employee emp : employees){
	            System.out.println("Employee: Id="+emp.empId+", Name="+emp.name+", Age="+ emp.age);
	        }

		
	}

}
