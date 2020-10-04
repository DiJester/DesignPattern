package state.threadSim;

public class Terminated extends State{
    public Terminated() {
        stateName="Terminated";
    }

    @Override
    public void move(MyThread t, Action a) {
        switch (a.act){
            default:
                break;
        }
    }
}
