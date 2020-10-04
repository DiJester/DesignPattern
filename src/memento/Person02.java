package memento;

import java.io.Serializable;

public class Person02 implements Serializable {
    String name;
    Location loc;

    public Person02(String name,String street,String roomno){
        this.name = name;
        this.loc = new Location(street,roomno);
    }
    public String toString() {
        return " name:"+name+" loc:"+loc;
    }
    class Location implements Serializable{
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
}
