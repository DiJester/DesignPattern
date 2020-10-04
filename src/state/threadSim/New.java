package state.threadSim;

public class New extends State{
    public New() {
        stateName= "New";
    }

    @Override
    public void move(MyThread t,Action a) {
        if(a.act.equals("start"))
            t.state = new Running();
    }
}
