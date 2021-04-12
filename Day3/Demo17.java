package Day3;

/**
 * Final
 * > The final keyword in java is used to restrict user
 * > The final keyword can be use in many context
 * 1. variable
 * 2. method
 * 3. class
 *
 * When we use final keyword with variable it become constant means its value cannot be changed
 * When we use final keyword with parent class method the child class cannot override that method
 * When we use final keyword with class no other class can able to inherit from the class
 *
 * */

public class Demo17 {

}

 class FinalDemo{ //we cannont inherit the class which is declared by using final, final keyword is just like sealed in the c#
    int a =10;
    final int b;

    public FinalDemo(){
        b = 20;  //we can assign the data but erasigning is not possible
    }


    public void changeVariable(int a){
        this.a = a;
    }

    public void changeVariableFinal(int b){
        //this.b = b; this will give error because we cannont change the data because we are using final keyword for variable
    	
    }

    public void parentNotFinalMethod(){
        System.out.println("Parent non final method");//we can override this method
    }

    public final void parentFinalMethod(){
        System.out.println("Parent final method");//we cannot override this method
    }
}

class FinalChildDemo extends FinalDemo{
    @Override
    public void parentNotFinalMethod() {
        System.out.println("child non final method");
    }
//    @Override
//    public void parentFinalMethod() {        //cannot be override this method
//        System.out.println("child final method");
//    }


}
