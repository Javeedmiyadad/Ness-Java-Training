package Day3;

public class Demo2 {
	public static void main(String[] args) {
	Books book1 = new Books();
	book1.name="Html";
	book1.author = "author 1";
	book1.price = 1000;
	
	Books book2 = new Books();
	book1.name="Css";
	book1.author = "author 2";
	book1.price = 2000;
	
	book1.print();
	book2.print();
	
}
}

class Books{
	public String name;
	public String author;
	public int price;
	
	public void print() {
		System.out.println("Book: Name ="+ name +", Author =" + author +", Price ="+ price);
	}
	
}
