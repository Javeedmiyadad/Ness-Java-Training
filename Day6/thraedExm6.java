package Day6;
/**
 * What will happen if i directly call run() instead of start() method
 * We can call run() method directly but there will no context switching and our both thread will
 * be treated as normal object not thread class object
 * */
public class thraedExm6 {
	public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun();
        TestCallRun t2 = new TestCallRun();

//        t1.start();
//        t2.start();
        t1.run();
        t2.run();

}
}

class TestCallRun extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //e.setStackTrace();
            }
            System.out.println(i);
        }
    }
}


