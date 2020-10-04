package interpreter;

abstract class ArithmeticOperator extends Operator{
    Expression left;
    Expression right;
    public ArithmeticOperator(Expression l,Expression r){
        this.left=l;
        this.right=r;
    }
}
