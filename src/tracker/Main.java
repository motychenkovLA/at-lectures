package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_AMOUNT_BUGS = 10;
        final String[] SEVERITY_ARRAY = {"Блокирующий", "Высокий", "Средний", "Низкий"};

        int action;
        Repository defectList = new Repository(MAX_AMOUNT_BUGS);

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Выберите действие: \n1. Добавить новый дефект \n2. Вывести список дефектов \n3. Выйти из программы");

            //как добавить игнорирование эксепшена при вводе в консоли строки??

            action = in.nextInt();
            in.nextLine(); // считываем конец строки, чтобы можно было следующим вводить в консоли String

            if (action == 1) {
                if (Repository.getBugsCount() < MAX_AMOUNT_BUGS) {
                    System.out.println("Введите резюме дефекта:");
                    String resume = in.nextLine();
                    System.out.println("Выберите критичность дефекта:");
                    for (int i = 0; i < SEVERITY_ARRAY.length; i++) {
                        System.out.println((i + 1) + ". " + SEVERITY_ARRAY[i]);
                    }
                    int choice = in.nextInt();
                    while (choice > SEVERITY_ARRAY.length || choice <= 0) {
                        System.out.println("Необходимо выбрать порядковый номер критичности от 1 до " + SEVERITY_ARRAY.length);
                        choice = in.nextInt();
                    }
                    String severity = SEVERITY_ARRAY[choice - 1];
                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    int daysToFix = in.nextInt();
                    defectList.add(new Defect(resume, severity, daysToFix));
                } else {
                    System.out.println("Невозможно добавить новый дефект. Максимальное количество дефектов - " + MAX_AMOUNT_BUGS + "\n");
                }
            } else if (action == 2) {
                defectList.getAll();
                System.out.println("\n");
            }
        } while (action != 3);
    }
}