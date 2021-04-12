package Day3;

/**
 * Polymorphism
 * > This is one of main pillar of OOPs
 * > Poly(Many) + Morph(Shape)
 * >
 * Polymorphism can be of two type
 * 1. Static / Compiler
 * 2. Dynamic / RunTime
 *
 * Method Overloading - static
 * Method Overriding - dynamic
 *
 * # Method Overloading
 * > In this case we define multiple method with same name by different parameters
 * > This is can be performed either within a class as well as between parent and child class
 * > Method overloading is all about defining multiple or adding behaviour to a method
 *
 * # Conditions for method overloading
 * 1. different number of parameters
 * 2. different type of parameters
 * 3. different order of parameters
 * 4. different return type - not valid
 *
 * */

public class Demo13 {
	public static void main(String[] args) {
	
	String message = "Javeed miyadad";
    message.indexOf('e');  //3
    message.indexOf('a', 5);  //10
    message.indexOf("ya");  //9

    System.out.println(message.indexOf('e'));
    System.out.println(message.indexOf('a', 5));
    System.out.println(message.indexOf("ya"));

}
}
