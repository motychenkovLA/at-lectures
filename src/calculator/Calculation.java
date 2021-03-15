package calculator;

public class Calculation implements Value {
    private final Value leftOperand;
    private final Operator operator;
    private final Value rightOperands;
    private final int result;

    public Calculation(Value leftOperand, Operator operator, Value rightOperands) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperands = rightOperands;
        this.result = operator.apply(leftOperand.get(), rightOperands.get());
    }

    public Value getLeftOperand() {
        return leftOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public Value getRightOperands() {
        return rightOperands;
    }

    public int getResult() {
        return result;
    }

    public String display() {
        return leftOperand.get() + " " + operator.getSymbol() + " " + rightOperands.get() + " = " + result;
    }

    @Override
    public int get() {
        return result;
    }
}
