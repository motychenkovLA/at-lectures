package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE = 10;

        Calculation[] calculations = new Calculation[SIZE];
        int index = 0;

        while (true) {
            System.out.println("Введите число: ");
            int leftOperand = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите операцию: ");
            String operator = scanner.nextLine();

            System.out.println("Введите число: ");
            int rightOperand = scanner.nextInt();
            scanner.nextLine();

            calculations[index] = new Calculation(leftOperand, operator, rightOperand);

            System.out.println(calculations[index].display());

            index++;

            System.out.println("quit - выйти, any key - продолжить");
            String stop = scanner.nextLine();
            if (stop.equals("quit") || index == SIZE) break;
        }
    }

}
