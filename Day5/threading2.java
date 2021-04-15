package Day5;

class MultiThreading implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running....");
	}
}

public class threading2 {
	public static void main(String[] args) {
		MultiThreading mul = new MultiThreading();//there is no start() method in the runnable interface so we have tho create object of thread and pass the parameter into constructor
	    Thread th = new Thread(mul);
	    th.start();
	}

}
