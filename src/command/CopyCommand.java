package command;

class CopyCommand extends Command{
    int sPos;
    int ePos;
    int dPos;
    Command cmd;
    public CopyCommand(Content src, int sPos, int ePos,int dPos) {
        super(src);
        this.sPos =sPos;
        this.ePos =ePos;
        this.dPos =dPos;
        String tmp = this.src.getContent().substring(sPos,ePos);
        cmd = new InsertCommand(this.src,dPos,new Content(tmp));
    }

    @Override
    public boolean exec() {
        if(!done) {
            cmd.exec();
            done =true;
            return true;
        }
        return false;
    }

    @Override
    public boolean undo() {
        if(done) {
            cmd.undo();
            done = false;
            return true;
        }
        return false;
    }
}
