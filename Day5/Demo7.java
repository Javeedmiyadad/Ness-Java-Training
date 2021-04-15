package Day5;


// we can have different catch blocks for catching diff different exceptions
public class Demo7 {
	 public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        int c = 0;

	        try{
	            c = a /b;
	        }
	        catch (ArithmeticException e){
             System.out.println(e.getMessage());
	        }
	        catch (NullPointerException | NumberFormatException e){
	         System.out.println(e.getMessage());
	        }
	        catch (Exception e){
	         System.out.println(e.getMessage());
	        }

	    }

}
