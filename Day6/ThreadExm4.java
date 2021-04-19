package Day6;

public class ThreadExm4 {
  public static void main(String[] args) {
	  threadDemo1 t1 = new threadDemo1();
	  threadDemo2 thread = new threadDemo2();
	  Thread t2 = new Thread(thread);
	  t1.start();
	  t2.start();
	 
  }
}

class threadDemo1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread 1 is running...");
	}
}
class threadDemo2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread 2 is running...");
	}
}
