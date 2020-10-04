package prototype.deeepClone;

public class Person implements Cloneable{
    String name;
    Location loc;

    public Person(String name,String street,String roomno){
        this.name = name;
        this.loc = new Location(street,roomno);
    }
    public String toString() {
        return " name:"+name+" loc:"+loc;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p  = (Person)super.clone();
        p.loc = (Location) this.loc.clone();
        return p;
    }

}
class Location implements Cloneable{
    public String street;
    public String roomno;
    public Location(String street,String roomno) {
        this.street = street;
        this.roomno = roomno;

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString() {
        return " street:"+street+" room no:"+roomno;
    }
}
