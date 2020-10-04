package templateMethod;

public class templateMethodTest {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();
        c.templatedMethod();
    }
}
