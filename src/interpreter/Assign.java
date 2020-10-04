package interpreter;

public class Assign extends Operator{
    Variable dst;
    Expression src;
    Integer num;
    public Assign(Variable dst, Expression src){
        this.dst= dst;
        this.src=src;
        this.num = null;
    }
    public Assign(Variable dst, int num){
        this.dst= dst;
        this.num=num;
        this.src =null;
    }
    @Override
    public int interpret() {
        if(this.num==null)
            dst.value = src.interpret();
        else
            dst.value = num;
        return dst.value;
    }
}
