package Day3;

public class Demo14 {

}

class Calculation{

    public void test(){
        System.out.println("1st Method");
    }

    public void test(int a){
        System.out.println("2nd method");
    }
    

    public void test(String s){
        System.out.println("3rd method");
    }

    public void test(int a, String b){
        System.out.println("4th method");
    }

    public void test(String b, int a){
        System.out.println("5th method");
    }

//    public int test(){ //it is not a overloading
//        return 10;
//    }
}
