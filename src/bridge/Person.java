package bridge;

class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    public void give(Person p,Gift g)
    {
        System.out.println(this.name +" gives "+ p.name+" a "+g.trait+" "+g.giftImp.gName+" "+g.giftImp.gImName);
    }
}
