package builder;

class Person {
	int id;
	String name;
	int age;
	double weight;
	int score;
	Location loc;
	
	private Person() {}
	public String toString() {
		return "id:"+id+" name:"+name+" age:"+age+" weight:"+weight+" score:"+score+" loc:"+loc;
	}
	public static class PersonBuilder{
		Person p = new Person();
		public PersonBuilder basicInfo(int id, String name,int age) {
			p.id = id;
			p.name = name;
			p.age = age;
			return this;
		}
		public PersonBuilder weight(double weight) {
			p.weight = weight;
			return this;
		}
		public PersonBuilder score(int score) {
			p.score = score;
			return this;
		}
		public PersonBuilder location(String street, String roomno) {
			p.loc = new Location(street,roomno);
			return this;
		}
		public Person build() {
			return p;
		}
	}
}
class Location{
	public String street;
	public String roomno;
	public Location(String street,String roomno) {
		this.street = street;
		this.roomno = roomno;
		
	}
	public String toString() {
		return " street:"+street+" room no:"+roomno;
	}
}
