package state.threadSim;

public class Running extends State{
    public Running() {
        stateName="Running";
    }

    @Override
    public void move(MyThread t, Action a) {
        switch (a.act){
            case "yield":
                t.state = new Ready();
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
