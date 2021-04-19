package Day6;
/**
 * Priority of a Thread
 * Each thread can have their own priority
 * and this priority represent by a number between 1 to 10
 * most of the case thread scheduler schedule the thread according to their priority
 * but it is not guaranteed because depend upon JVM specification
 *
 * MIN_PRIORITY
 * MAX_PRIORITY
 * NORM_PRIORITY
 * */

public class threadExm8 {
	public static void main(String[] args) {
		Exm t1 = new Exm();
		Exm t2 = new Exm();
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.MAX_PRIORITY);
     t1.start();
     t2.start();
 }
}
class Exm extends Thread {
	@Override
	public void run() {
		  System.out.println("running thread name is "+ Thread.currentThread().getName());
		  System.out.println("running thread priority is "+ Thread.currentThread().getPriority());
	}
}
