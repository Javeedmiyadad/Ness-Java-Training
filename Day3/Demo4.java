package Day3;

public class Demo4 {
	public static void main (String[] args) {
		Exm exm1 = new Exm("Html", "author 1",1000);
		Exm exm2 = new Exm("Css", "author 2",2000);
		
		exm1.print();
		exm2.print();
	}

}

class Exm {
	public String name;
	public String author;
	public int price;
	
	public Exm(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public void print() {
		System.out.println("Book: Name ="+ name +", Author =" + author +", Price ="+ price);
	}
}
