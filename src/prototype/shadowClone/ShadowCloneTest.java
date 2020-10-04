package prototype.shadowClone;

public class ShadowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Lucy","Wall St.","1st Ave. No.210");
        Person p2 = (Person) p1.clone();
        System.out.println(p1.loc==p2.loc);
        p2.loc.street="Shannon St.";
        System.out.println(p1);
    }
}

