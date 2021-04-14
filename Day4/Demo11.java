package Day4;

public class Demo11 {
	public static void main(String[] args) {
		
		account acc = new account(123456789);
		System.out.println(acc.getAccountNumber());
		acc.deposit(10000);
		acc.withdraw(5000);
		System.out.println(acc.getBalance());
		acc.deposit(2000);
		System.out.println(acc.getBalance());
		acc.withdraw(8000);
	} 
}


class insufficientFundException extends Exception{
	private double amount;
	
	public insufficientFundException() {
		System.out.println("insufficient amount");
	}
	
	public insufficientFundException(String message) {
		System.out.println(message);
	}
}


class account{
	private double _balance = 0;
	private int _accountNumber;
	
	public account(int accountNumber) {
		this._accountNumber = accountNumber;
	}
	
   public void deposit(double amount) {
		   _balance += amount;
		   System.out.println("Amount credited : "+ amount);
   }
   public void withdraw(double amount) {
	   if(amount<= _balance) {
	   _balance -= amount;
	   System.out.println("Amount debited : "+ amount); 
	   }
	   else {
		   try {
		   throw new insufficientFundException();
		   }catch (insufficientFundException ex){
			   ex.printStackTrace();
		   }
	   }
   }
   public double getBalance() {
	   return _balance;
   }
   public int getAccountNumber() {
	   return _accountNumber;
   }
}