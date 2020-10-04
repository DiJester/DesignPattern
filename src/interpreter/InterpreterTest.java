package interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        Variable a =new Variable();
        Variable b= new Variable();
        Variable c= new Variable();
        new Assign(a,10).interpret();
        new Assign(b,100).interpret();
        new Assign(c,50).interpret();
        System.out.println(a.interpret());
        Expression e = new Subtract(new Add(a, b), c);
        System.out.println(e.interpret());
    }

}
