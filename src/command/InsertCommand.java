package command;

public class InsertCommand extends Command{
    private int pos;
    private Content str;
    public InsertCommand(Content src, int pos, Content str)
    {
        super(src);
        this.pos = pos;
        this.str = str;
    }
    @Override
    public boolean exec() {
        if(!done) {
            String tmp1 = src.getContent().substring(0, pos);
            String tmp2 = src.getContent().substring(pos);
            this.src.setContent( tmp1 + str.getContent() + tmp2);
            done =true;
            return true;
        }
        return false;
    }

    @Override
    public boolean undo() {
        if(done) {
            String tmp1 = this.src.getContent().substring(0, pos);
            String tmp2 = this.src.getContent().substring(0 + tmp1.length() + str.length());
            this.src.setContent(tmp1 + tmp2);
            done = false;
            return true;
        }
        return false;
    }
}
