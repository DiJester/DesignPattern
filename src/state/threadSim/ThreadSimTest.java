package state.threadSim;

import java.util.Random;

public class ThreadSimTest {
    public static void main(String[] args) {
        MyThread t1= new MyThread("T1",new New());
        while(true){
            int i = new Random().nextInt(8);
            switch(i){
                case 0:
                    t1.start();
                    break;
                case 1:
                    t1.run();
                    break;
                case 2:
                    t1.yield();
                    break;
                case 3:
                    t1.park();
                    break;
                case 4:
                    t1.unpark();
                    break;
                case 5:
                    t1.waits();
                    break;
                case 6:
                    t1.notifys();
                    break;
                case 7:
                    t1.terminate();
                    break;
                default:
                    break;
            }
            t1.print();
            if(t1.state.stateName.equals("Terminated"))
                break;
        }
    }
}

