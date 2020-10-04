package state.threadSim;

abstract class State {
    String stateName;
    public State(){

    }
    public abstract void move(MyThread t,Action a);
    public String toString() {
        return stateName;
    }
}
