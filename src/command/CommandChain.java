package command;

import java.util.ArrayList;
import java.util.List;

public class CommandChain {
    private List<Command> list;
    private int curPos;
    public CommandChain(){
        list = new ArrayList<Command>();
        curPos=-1;
    }
    public boolean execCommand(){
        for(Command cmd:list){
            curPos++;
            if(!cmd.exec()){
                return false;
            }
        }
        return true;
    }
    public boolean undoCommand(){
        for(int i = curPos;i>=0;i--){
            if(!list.get(i).undo())
                return false;
        }
        return true;
    }
    public CommandChain addCommand(Command cmd) {
        this.list.add(cmd);
        return this;
    }
    public void remove(Command cmd){
        this.list.remove(cmd);
    }
    public void remove(int index){
        this.list.remove(index);
    }
    public int size(){
        return list.size();
    }
}
