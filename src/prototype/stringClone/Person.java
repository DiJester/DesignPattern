package prototype.stringClone;

class Person implements Cloneable{
    String name;
    StringBuilder street;

    public Person(String name,StringBuilder street){
        this.name = name;
        this.street = street;
    }
    public String toString() {
        return " name:"+name+" street:"+street.toString();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
