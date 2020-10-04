package state.threadSim;

public class Ready extends State{
    public Ready() {
        stateName="Ready";
    }

    @Override
    public void move(MyThread t, Action a) {
        switch (a.act){
            case "run":
                t.state = new Running();
                break;
            case "terminate":
                t.state = new Terminated();
                break;
            case "wait":
            case "park":
                t.state = new Waiting();
                break;
            default:
                break;
        }
    }
}
