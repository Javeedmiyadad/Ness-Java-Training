package Day3;

/**
 * Class
 * When we define a class we define a blue print for data type
 * this does not actually mean any data but it does define what the class name means
 * what class consist of what operation can be performed on object
 * The method and variables that consitute a class are called as members of the class
 *
 * Define a class
 * <access modifier> class <class Name>{
 *      // member variable
 *     <access modifier> <data_type> <variable_name>
 *      // member function
 *     <access modifier> <return type> <method_name>(parameter){
 *         // body
 *     }
 * }
 * access modifier specify the access rule for member as well as class by default it is default and for members it is private
 * data type specify the type of variable and return type specify the data type of the method return rules
 * to access the class members we use (.) operator
 *
 * Java is case sensitive
 * Every line should end with semicolon
 * main is main entry point for you java program
 *
 * DRY - Do not Repeat Yourself
 *
 * */

public class Demo1 {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.name="Html";
		book1.author = "author 1";
		book1.price = 1000;
		
		Book book2 = new Book();
		book1.name="Css";
		book1.author = "author 2";
		book1.price = 2000;
		
		System.out.println("Book: Name ="+ book1.name +", Author =" + book1.author +", Price ="+ book1.price);
		System.out.println("Book: Name ="+ book2.name +", Author =" + book2.author +", Price ="+ book2.price);
		

}
}
class Book{
	public String name;
	public String author;
	public int price;
}
