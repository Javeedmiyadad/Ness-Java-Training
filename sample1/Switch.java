package sample1;

public class Switch {
	
	public static void main (String[] args) {
		
		
//		switch case examples
		
		int num = 3;
		String word ="three";
		
		switch(num) {
		 case 1:{
			System.out.println("one");
			break;
		}
		 case 2:{
				System.out.println("two");
				break;
			}
		 case 3:{
				System.out.println("three");
				break;
			}
		 default:{
			 System.out.println("Invalid");
		 }
		}
		switch(word) {
		 case "one":{
			System.out.println(1);
			break;
		}
		 case "two":{
				System.out.println(2);
				break;
			}
		 case "three":{
				System.out.println(3);
				break;
			}
		 default:{
			 System.out.println("Invalid");
		 }
		}
	}

	}


