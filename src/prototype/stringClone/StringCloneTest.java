package prototype.stringClone;


class StringCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Lucy",new StringBuilder("Wall St."));
        Person p2 = (Person) p1.clone();
        System.out.println(p1.name==p2.name);
        System.out.println(p1.street==p2.street);
        p2.name="Mike";
        p2.street.reverse();
        System.out.println(p1);

        String tmp  = new String("Lily");
        Person p3 = new Person(tmp,new StringBuilder("Wall St."));
        Person p4 = (Person) p3.clone();
        System.out.println(p3.name==p4.name);
        p4.name=new String("Mike");
        System.out.println(p3);

    }
}
