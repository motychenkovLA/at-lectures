package calculator;

public class Operator {
    private final String symbol;

    public Operator(String symbol) {
        if (isLegalSymbol(symbol)) {
            this.symbol = symbol;
        } else {
            this.symbol = "";
        }
    }

    public int apply(int leftOperand, int rightOperand) {
        switch (symbol) {
            case "+": return leftOperand + rightOperand;
            case "-": return leftOperand - rightOperand;
            case "/": return leftOperand / rightOperand;
            case "*": return leftOperand * rightOperand;
            case "%": return leftOperand % rightOperand;
            default:
                System.out.println("Неверная операция");
                return 0;
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public static boolean isLegalSymbol(String symbol) {
        return "+".equals(symbol) || "-".equals(symbol) || "/".equals(symbol) || "*".equals(symbol) || "%".equals(symbol);
    }
}
