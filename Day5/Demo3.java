package Day5;

/**
 *ArrayIndexOutOfBoundException
 *
 * IndexOfBound -> RunTimeException -> Exception -> Throwable
 *
 * **/

public class Demo3 {
	public static void main(String[] args) {
		
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		//a[3] = 1;
		
		try
		{
		System.out.println(a[100]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
