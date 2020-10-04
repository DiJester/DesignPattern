package state.personState;

class Person {
    public State state;
    public String name;
    public Person(String name,State s){
        this.name = name;
        this.state = s;
    }
    public void cry(){
        System.out.print(this.name);
        state.cry();
    }
    public void smile(){
        System.out.print(this.name);
        state.smile();
    }
}
