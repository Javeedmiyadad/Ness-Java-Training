package Day6;
/**
 * getName()
 * setName()
 *
 * */

public class threadExm7 {
	public static void main(String[] args) {
		threadDemo3 t1 = new threadDemo3();
		threadDemo3 t2 = new threadDemo3();
		System.out.println("Name : " + t1.getName());
		System.out.println("Name : " + t2.getName());
		t1.start();
		t2.start();
		t1.setName("New thread 1");
		t2.setName("New thread 2");
		System.out.println("Name : " + t1.getName());
		System.out.println("Name : " + t2.getName());
	}

}
class threadDemo3 extends Thread{
	@Override
	public void run() {
		System.out.println("thread is running");
	}
}
