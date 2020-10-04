package visitor.asm;

public class Person {

	public void greets() {
		System.out.println("Greetings...");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.greets();
	}
}
