package Day2;

import java.util.Scanner;

public class arraExm4 {
	
	public static void main (String[] args) {
		
		int n;  
	    int diff = Integer.MIN_VALUE;
	    int mindiff = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[10]; 
		System.out.println("Enter the elements of the array: ");
		
		for(int i = 0; i < n; i++)  
		{    
		array[i] = sc.nextInt();
		}  
		 
	    for (int i = 0; i < array.length - 1; i++)
	    {
	        for (int j = i + 1; j < array.length; j++)
	        {
	             diff = Integer.max(diff, array[j] - array[i]);
	        }
	    }
	    for (int i = 0; i < array.length - 1; i++)
	    {
	        for (int j = i + 1; j < array.length; j++)
	        {
	             mindiff = Integer.min(mindiff, array[j] - array[i]);
	        }
	    }
	 
	 
         System.out.println("The maximum difference is " + diff);
         System.out.print("The maximum difference is " + mindiff);
	    }
	 
	}


