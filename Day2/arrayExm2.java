package Day2;
import java.util.Scanner;  

public class arrayExm2 {
	
	public static void main (String[] args) {
		
		int n;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[10]; 
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i] );
        }
		}    
}


