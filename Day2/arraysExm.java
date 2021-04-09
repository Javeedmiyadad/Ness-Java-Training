package Day2;

public class arraysExm {
	
	public static void main (String[] args) {
		/* Arrays are the collection of elements */
		
		/* Syntax <datatype> [] arrayname = new <datatype>[]; */
		
		
//		declaration
		/*
		 * int a[]; int b[]; int c[];
		 */
		
//		declaration and initialization
		
		int[] array =new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		
		
		for (int i =0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
//		declaration,instantiate,initialization
		
		int[] numbers = {10,20,30,40};
		for(int i =0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for (int number : numbers) /* just like foreach loop in c# */
		{
			System.out.print(number);
		}
		System.out.println(numbers[1]); /* if i want to display index by index */
	}

}
