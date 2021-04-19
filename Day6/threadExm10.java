package Day6;

/**
 * Synchronization in Java
 * It is a capability to control the access of multiple threads to any share resource
 * It give us better option where we want to allow only one thread to access the shared resource
 *
 * # Why use synchronization
 * 1. to prevent thread interface
 * 2. to prevent consistency problem
 *
 * # Type of Synchronization
 * 1. Process Synchronization
 * 2. Thread Synchronization
 *
 * */

public class threadExm10 {
	public static void main(String[] args) {
		Table tbl = new Table();
		myThread1 t1 = new myThread1(tbl);
		myThread2 t2 = new myThread2(tbl);
		t1.start();
		t2.start();
	}

}

class Table{
	//without synchronization
//	public void printable(int number) {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(number + " x "+ i + " = "+ number *i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	//with synchronization
	 synchronized public void printable(int number) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + " x "+ i + " = "+ number *i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class myThread1 extends Thread{
	Table table;
	myThread1(Table table){
		this.table = table;
	}
	@Override
	public void run() {
		table.printable(5);
	}
}

class myThread2 extends Thread{
	Table table;
	myThread2(Table table){
		this.table = table;
	}
	@Override
	public void run() {
		table.printable(10);
	}
}
