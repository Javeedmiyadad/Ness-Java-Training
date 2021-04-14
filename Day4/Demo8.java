package Day4;

class EncapsulationDemo{

    public void publicMethod(){
        System.out.println("public method");
    }

    private void privateMethod(){
        System.out.println("private method");
    }

    protected void protectedMethod(){
        System.out.println("protected method");
    }

}
 class Demo8 {
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.protectedMethod();
        obj.publicMethod();
        
    }
}
