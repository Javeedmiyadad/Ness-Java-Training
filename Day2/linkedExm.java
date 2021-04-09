package Day2;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedExm {
	
	 public static void main(String[] args) {

		 
//		 * LinkedList
//		 * 1. can contain duplicate elements
//		 * 2. non synchronized
//		 * 3. maintain insertion order
//		 * 4. manipulation is fast
//		 *
//		 * LinkedList -> AbstractSequentialList -> List -> Collection -> Iterable
		 
		 //LinkedList
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Mark");
	        list.add("Paul");
	        list.add("Watson");
	        list.add("John");

	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
	        
	        System.out.println("*******************");
	        LinkedList<String> names = new LinkedList<>();
	        names.add("Mark");
	        names.add("Paul");
	        names.add("Watson");

	        names.add(2, "John");

	        LinkedList<String> newList = new LinkedList<>();
	        newList.add("Smith");
	        newList.add("Stacy");

	        names.addAll(newList);
	        System.out.println(names);
	        
	        names.addFirst("FirstName");
	        names.addLast("LastName");
	        System.out.println(names);
	        
	        names.removeFirst();
	        names.removeLast();
	        System.out.println(names);
	        
	        names.removeAll(newList);
	        System.out.println(names);
	        
	        names.removeFirstOccurrence("Mark");
	        names.removeLastOccurrence("Paul");
	        System.out.println(names);
	        
	        names.clear();
	        System.out.println(names);

       }
}
