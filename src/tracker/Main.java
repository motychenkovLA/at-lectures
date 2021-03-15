package tracker;

import java.util.Scanner;

public class Main {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository(CAPACITY);

        boolean run = true;
        while (run) {
            System.out.println("add - добавить новый дефект; list - вывести список дефектов; quit - выйти");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    add(scanner, repository);
                    break;
                case "list":
                    list(repository);
                    break;
                case "quit":
                    run = false;
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }

    private static void add(Scanner scanner, Repository repository) {
        if (repository.isFull()) {
            System.out.println("Список дефектов заполнен");
            return;
        }
        System.out.println("Резюме дефекта:");
        String resume = scanner.nextLine();

        System.out.println("Критичность дефекта: Блокирующий, Высокий, Средний, Низкий:");
        String severity = readString(scanner, "Блокирующий", "Высокий", "Средний", "Низкий");

        System.out.println("Дней на исправление:");
        int daysToFix = readInt(scanner);

        repository.add(new Defect(resume, severity, daysToFix));
    }

    private static void list(Repository repository) {
        if (repository.isEmpty()) {
            System.out.println("Список дефектов пуст");
        }
        for (Defect defect : repository.getAll()) {
            System.out.println(defect.asString() + "\n");
        }
    }

    private static String readString(Scanner scanner, String ... validStrings) {
        while (true) {
            String result = scanner.nextLine();
            for (String validString : validStrings) {
                if (result.equals(validString)) return result;
            }
            System.out.println("Неверное значение");
        }
    }

    private static int readInt(Scanner scanner) {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}
