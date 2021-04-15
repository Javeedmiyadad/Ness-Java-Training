package Day5;

class threadExm extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Threading3 {
	public static void main (String [] args) {
		threadExm th1 = new threadExm();
		threadExm th2 = new threadExm();
		th1.start();
		th2.start();
	}

}
