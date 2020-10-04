package state.personState;

public class PersonStateTest {
    public static void main(String[] args) {
        Person p = new Person("Lucy",new HappyState());
        p.cry();
        p.smile();
        p.state = new SadState();
        p.cry();
        p.smile();
    }
}
