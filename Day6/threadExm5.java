package Day6;
/**
 * Can we start a thread twice?
 * No after starting a thread we can never start thread again it will throw an exception - IllegalThreadStateException
 * */

public class threadExm5 {
	public static void main(String[] args) {
		threadDemo t1 = new threadDemo();
		t1.start();
		t1.start();
	}

}
class threadDemo extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
}
