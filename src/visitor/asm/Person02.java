package visitor.asm;

public class Person02 {
    long time = 0;
    public void greets() {
        System.out.println("Greetings...");
    }
    public static void main(String[] args) {
        Person02 p02 = new Person02();
        p02.greets();
    }
}

