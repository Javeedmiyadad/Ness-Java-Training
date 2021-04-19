package Day6;

/**
 * Inter thread communication
 * IT all about co-operation or allowing synchorized thread to communicate with each other
 * wait() - current thread to release the lock and wait until either another thread invoke notify
 * notify() - to get an update from the thread
 * notifyAll()
 *
 * **/

public class Exm13 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		depositThread depo = new depositThread(bank);
		withdrawThread with = new withdrawThread(bank);
		with.start();
		depo.start();
		
		
	}

}

class Bank{
	int balance = 1000;
	
	synchronized public void withdraw(int amount) {
		 System.out.println("Withdraw processing....");
		 if(balance < amount) {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			 balance -= amount;
			 System.out.println("Withdraw competed!!");
		 }
		
	}
	synchronized public void deposit(int amount) {
		System.out.println("deposit processing...");
        balance += amount;
        System.out.println("deposit completed!!");
        notify();
	}
}

class depositThread extends Thread{
	Bank bank;
	public depositThread(Bank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		bank.deposit(10000);
	}
}

class withdrawThread extends Thread{
	Bank bank;
	public withdrawThread(Bank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		bank.withdraw(15000);
	}
}
