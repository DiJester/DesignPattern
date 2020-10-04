package state.threadSim;

public class MyThread {
    State state;
    String name;
    public MyThread(String tName, State tState){
        this.name = tName;
        this.state = tState;
    }
    private void move(Action action) {
        this.state.move(this,action);
    }
    public void start(){
        move(new Action("start"));
    }
    public void run(){
        move(new Action("run"));
    }
    public void yield(){
        move(new Action("yield"));
    }
    public void terminate(){
        move(new Action("terminate"));
    }
    public void park(){
        move(new Action("park"));
    }
    public void unpark(){
        move(new Action("unpark"));
    }
    public void waits(){
        move(new Action("wait"));
    }
    public void notifys(){
        move(new Action("notify"));
    }
    public void print() {
        System.out.println(this);
    }
    public String toString() {
        return "Thread:"+name+" State:"+state.toString();
    }
}
