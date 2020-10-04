package interpreter;

class Add extends ArithmeticOperator{
    public Add(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public int interpret() {
        return left.interpret()+right.interpret();
    }
}
