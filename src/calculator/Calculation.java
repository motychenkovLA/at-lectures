package calculator;

public class Calculation {
    private int leftOperand;
    private String operation;
    private int rightOperands;
    private int result;

    public Calculation(int leftOperand, String operation, int rightOperands) {
        this.leftOperand = leftOperand;
        this.operation = operation;
        this.rightOperands = rightOperands;
        this.result = 0;

        switch (operation) {
            case "+": result = leftOperand + rightOperands; break;
            case "-": result = leftOperand - rightOperands; break;
            case "/": result = leftOperand / rightOperands; break;
            case "*": result = leftOperand * rightOperands; break;
            case "%": result = leftOperand % rightOperands; break;
            default:
                System.out.println("Неверная операция");
        }
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public String getOperation() {
        return operation;
    }

    public int getRightOperands() {
        return rightOperands;
    }

    public int getResult() {
        return result;
    }

    public String display() {
        return leftOperand + " " + operation + " " + rightOperands + " = " + result;
    }
}
