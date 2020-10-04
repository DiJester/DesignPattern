package builder;

public class PersonBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person.PersonBuilder builder = new Person.PersonBuilder();
        Person p = builder.basicInfo(1243, "张三", 25)
                .weight(60)
                //.score(90)
                .location("Wall St.", "1st Ave. No.23")
                .build();
        System.out.println(p);
	}

}
