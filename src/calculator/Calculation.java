package calculator;

public class Calculation {
    private final int leftOperand;
    private final Operator operator;
    private final int rightOperands;
    private final int result;

    public Calculation(int leftOperand, Operator operator, int rightOperands) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperands = rightOperands;
        this.result = operator.apply(leftOperand, rightOperands);
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public int getRightOperands() {
        return rightOperands;
    }

    public int getResult() {
        return result;
    }

    public String display() {
        return leftOperand + " " + operator.getSymbol() + " " + rightOperands + " = " + result;
    }
}
