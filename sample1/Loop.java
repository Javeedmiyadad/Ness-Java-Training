package sample1;

public class Loop {

	public static void main (String[] args) {
		
		
		
//		For loop
		/* <pyramid 1> */
		
		
		/*
		 * for (int i=0; i<5;i++) { for (int j=0;j<=i;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		 
		 
		
//		<pyramid2>
		
		/*
		 * for (int i=4; i>=0;i--) { for (int j=0;j<=i;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		 
		
		
//		<pyramid3>
		
		
		/*
		 * for(int i=0; i<5; i++) { for(int j=2*(5-i); j>=0; j--) {
		 * System.out.print(" "); } for(int j=0; j<=i; j++) { System.out.print("* "); }
		 * 
		 * System.out.println(); }
		 */
		 
		 
//		  <pyramid4>
			
		/*
		 * for(int i=4; i>=0; i--) { for(int j=2*(5-i); j>=0; j--) {
		 * System.out.print(" "); } for(int j=0; j<=i; j++) { System.out.print("* "); }
		 * 
		 * System.out.println(); }
		 */
		 
//		  <pyramid 5>
		
		   for (int i=0; i<5; i++)
	        {
	            for (int j=5-i; j>1; j--)
	            {
	                System.out.print(" ");
	            }
	  
	            for (int j=0; j<=i; j++ )
	            {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
		 
	}
}
