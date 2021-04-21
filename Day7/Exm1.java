package Day7;

// Singleton design pattern

final class Singleton {
	private static int counter = 0;
	private static Singleton instance = null;

	private Singleton() {

		counter++;
		System.out.println("Counter : " + counter);

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}
// class child extends Singleton{ //we can create class inside singleton class outside is not possible bcz we constructor is private
//	 public child() {//we have to restrict this by making singleton a final
//		 
//	 }
}

class Exm1 {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		// we can create n number of objects but it get called once only

	}
}