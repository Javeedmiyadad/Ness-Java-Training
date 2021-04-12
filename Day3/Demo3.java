package Day3;

public class Demo3 {
	public static void main(String[] args) {
		
		Example obj1 = new Example();
		obj1.setTitle("Html");
		obj1.setAuthor("author 1");
		obj1.setPrice(1000);
		
		Example obj2 = new Example();
		obj2.setTitle("Css");
		obj2.setAuthor("author 2");
		obj2.setPrice(2000);
		
		obj1.print();
		obj2.print();
		
	}

}

class Example{
	private String name;
	private String author;
	private int price;
	
	 public String getTitle() {
	        return name;
	    }

	    public void setTitle(String name) {
	        this.name = name;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }
	
	public void print() {
		System.out.println("Book: Name ="+ name +", Author =" + author +", Price ="+ price);
	}
	
}
