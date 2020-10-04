package interpreter;

class Variable extends Expression{
    int value;
    public Variable(int v){
        value = v;
    }

    public Variable() {
        value = 0;
    }

    @Override
    public int interpret() {
        return value;
    }
}
