package prototype.shadowClone;

class Person implements Cloneable{
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
            return super.clone();
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

