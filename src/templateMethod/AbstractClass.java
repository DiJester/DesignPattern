package templateMethod;

abstract class AbstractClass {
    public void templatedMethod(){
        op1();
        op2();
    }
   abstract void op1();
   abstract void op2();
}
