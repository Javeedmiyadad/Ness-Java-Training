package Day5;

/***
 * # Multithreading in Java
 * It is a process of executing multiple thread simultaneously
 *
 * A thread is a lightweight sub-process, the smallest unit of processing which a separate path of execution
 *
 * Multithreading and multiprocessing both are used to achieve multitasking
 *
 * # Advantage of Multithreading
 * 1. It doesn't block the user as thread are independent and you can perform multiple opeartions at the same time.
 * 2. It save time by performing many opeartion together
 * 3. Thread are independent so it does not affect the other thread if an execution occur in single thread
 *
 * # Multitasking
 * It is a process of executing multiple task simultaenously
 * We can utilize the CPU to the fullest
 * It can be achieve in two ways
 *
 * 1. Process based multitasking
 * 2. thread base multi tasking
 *
 * Process based multitasking
 * 1. Each process has an address in the memory
 * 2. Each process allocated a separate memeory area
 * 3. A process is heavyweight
 * 4. cost of communication is hight
 * 5. Switching between the process is expensive and time consuming
 *
 * Thread based multitasking
 * 1. THread shared the same address space
 * A thread is lightweight
 * cost of communication is low and time efficient
 *
 *
 * Java proviude thread class to achieve thread programming
 * Thread class provides constructor and method to create and perform opeartion on the thread
 *
 * How many ways we can create
 * 1. By extending thread class
 * 2. implementing runnable interface
 *
 * Thread class
 * Constructor
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r, String name)
 *
 * Thread method
 * run()
 * start()
 * sleep()
 * ..
 *
 *
 *
 * # Runnable interface
 * The interface can be implemented by any class whose instance are intended to be executed by thread
 * there is only one method in the runnable interface
 *
 * run() - is used to perform action for a thread
 *
 * start() - is use to start a newly created thread
 *
 * Thread life cycle
 * a thread can be on one of the five state
 *
 * new
 * runnable
 * running
 * terminated non runnable
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */


class multiThreadDemo extends Thread{ // by extending thread class
	@Override
	public void run() {
		System.out.println("Thread is running ...");
	}
}

public class Threading {
	public static void main (String[] args) {
		multiThreadDemo multi = new multiThreadDemo();
		multi.start();
	}

}
