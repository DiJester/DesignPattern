package interpreter;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

class Subtract extends ArithmeticOperator{
    public Subtract(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public int interpret() {
        return left.interpret()-right.interpret();
    }
}
