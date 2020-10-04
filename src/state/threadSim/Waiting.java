package state.threadSim;

public class Waiting extends State{
    public Waiting() {
        stateName="Waiting";
    }

    @Override
    public void move(MyThread t, Action a) {
        switch (a.act){
            case "notify":
            case "unpark":
                t.state = new Ready();
                break;
            default:
                break;
        }
    }
}
