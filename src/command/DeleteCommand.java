package command;

public class DeleteCommand extends Command{
    int sPos;
    int ePos;
    String deleted;
    public DeleteCommand(Content src,int sPos,int ePos) {
        super(src);
        this.sPos =sPos;
        this.ePos = ePos;
    }

    @Override
    public boolean exec() {
        if(!done){
            String tmp1 = this.src.getContent().substring(0,sPos);
            String tmp2 = this.src.getContent().substring(ePos);
            deleted = this.src.getContent().substring(sPos,ePos);
            this.src.setContent(tmp1+tmp2);
            done =true;
            return true;
        }
        return false;
    }

    @Override
    public boolean undo() {
        if(done){
            String tmp1 = this.src.getContent().substring(0,sPos);
            String tmp2 = this.src.getContent().substring(sPos);
            this.src.setContent(tmp1+deleted+tmp2);
            done =false;
            return true;
        }
        return false;
    }
}
