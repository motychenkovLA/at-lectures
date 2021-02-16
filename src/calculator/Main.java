package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE = 10;
        int[] leftOperands = new int[SIZE];
        String[] operators = new String[SIZE];
        int[] rightOperands = new int[SIZE];
        int[] results = new int[SIZE];
        int index = 0;

        while (true) {
            System.out.println("Введите число: ");
            leftOperands[index] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите операцию: ");
            operators[index] = scanner.nextLine();

            System.out.println("Введите число: ");
            rightOperands[index] = scanner.nextInt();
            scanner.nextLine();

            results[index] = 0;
            switch (operators[index]) {
                case "+": results[index] = leftOperands[index] + rightOperands[index]; break;
                case "-": results[index] = leftOperands[index] - rightOperands[index]; break;
                case "/": results[index] = leftOperands[index] / rightOperands[index]; break;
                case "*": results[index] = leftOperands[index] * rightOperands[index]; break;
                case "%": results[index] = leftOperands[index] % rightOperands[index]; break;
                default:
                    System.out.println("Неверная операция");
            }

            System.out.println(leftOperands[index] + " " + operators[index] + " " + rightOperands[index] + " = " + results[index]);

            index++;

            System.out.println("quit - выйти, any key - продолжить");
            String stop = scanner.nextLine();
            if (stop.equals("quit") || index == SIZE) break;
        }
    }

}
