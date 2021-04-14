package Day4;

public class Dem02 {
	public static void main (String[] args) {
		IBank savings = new savingsAccount();
		IBank current = new currentAccount();
		
		savings.deposit(10000);
		savings.withdraw(11000);
		savings.withdraw(5000);
		savings.getBalance();
		
		System.out.println("----------------------------");
		
		current.deposit(10000);
		current.withdraw(20000);
		current.withdraw(6000);
		current.getBalance();
	}

}

interface IBank{
	boolean deposit(double amount);
	boolean withdraw(double amount);
	void getBalance();
}

class savingsAccount implements IBank{
	
	private double _balance;
	private double _perDayLimit;
	
	@Override
	public boolean deposit(double amount) {
		_balance += amount;
		System.out.println("Deposited amount :"+ amount);
		return true;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(_balance < amount) {
			System.out.println("Insufficient fund");
			return false;
		}
		else if(_perDayLimit + amount > 5000) {
			System.out.println("Per day withdrawal limit reached");
			return false;
		}
		else {
			_balance -= amount;
			_perDayLimit += amount;
			System.out.println("Debited " + _balance + " "+"from your account");
			System.out.println("Transaction successful");
			return true;		
		}
	}
	@Override
	public void getBalance() {
		System.out.println("Savings account available balance :" + _balance);
	}
}

class currentAccount implements IBank{
	
	private double _balance;
	
	@Override
	public boolean deposit(double amount) {
		_balance += amount;
		System.out.println("Deposited amount :"+ amount);
		return true;
}
	@Override
	public boolean withdraw(double amount) {
		if(_balance < amount) {
			System.out.println("Insufficient fund");
			return false;
		}
		else {
			_balance -= amount;
			System.out.println("Debited " + _balance + " "+"from your account");
			System.out.println("Transaction successful");
			return true;	
		}
	}
	@Override
	public void getBalance() {
		System.out.println("Current account available balance :" + _balance);
	}
	
}
