package Day5;

public class Demo2 {
	public static void main(String[] args) {
		authentication auth = new authentication();
//		try {
//			auth.loggedIn("admin1", "123");
//		} catch (UserAlreadyLoggedInException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		try {
			auth.loggedIn("admin", "123");
		} catch (UserAlreadyLoggedInException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			auth.loggedIn("admin", "123");
		} catch (UserAlreadyLoggedInException e) {
			// TODO Auto-generated catch block
			System.out.println("hey! you already logged in");
		}
	}

}

class UserAlreadyLoggedInException extends Exception{
	
}

class authentication{
	private boolean isLoggedIn = false;
	
	public void loggedIn(String email, String password) throws UserAlreadyLoggedInException {
		if (!isLoggedIn) {
			if (email.equals("admin") && password.equals("123")) {
				isLoggedIn = true;
				System.out.println("Welcome");
			}else {
				System.out.println("login failed! pls try again");
			}
		}else {
			throw new UserAlreadyLoggedInException();
		}
	}
}