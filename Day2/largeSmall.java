package Day2;

public class largeSmall {

	public static void main (String[] args) {
		
		int[] arr = {50,20,30,40,60};
		
		int large = arr[0];
		int small =arr[0];
		
		for (int i =1; i<arr.length;i++)
		{
			if (arr[i] > large)
			{
				large = arr[i];
			}
			else if (arr[i] < small)
			{
				small = arr[i];
			}
//			else
//			{
//				System.out.println(arr[i]);
//			}
		}
		System.out.println("Largest of an array = " + large);
		System.out.println("Smallest of an array = " + small);
		
	}
}
