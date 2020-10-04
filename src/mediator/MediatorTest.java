package mediator;

class MediatorTest {
    public static void main(String[] args) {
        User u1 = new User("Lucy");
        User u2 = new User("Lily");
        u1.sendMessage("Hello Lily!");
        u2.sendMessage("Hello Lucy!");
    }
}
