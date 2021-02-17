package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int WORK_WEEK = 5;
        final int MAX_AMOUNT_BUGS = 10;
        final String[] SEVERITY_ARRAY = {"Блокирующий", "Высокий", "Средний", "Низкий"};

        int action;
        int bugIndex = 0;
        String[] resumeArrayInfo = new String[MAX_AMOUNT_BUGS];
        String[] severityArrayInfo = new String[MAX_AMOUNT_BUGS];
        int[] daysToFixArrayInfo = new int[MAX_AMOUNT_BUGS];

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Выберите действие: \n1. Добавить новый дефект \n2. Вывести список дефектов \n3. Выйти из программы");

            //как добавить игнорирование эксепшена при вводе в консоли строки??

            action = in.nextInt();
            in.nextLine(); // считываем конец строки, чтобы можно было следующим вводить в консоли String

            if (action == 1) {
                if (bugIndex < MAX_AMOUNT_BUGS) {
                    System.out.println("Введите резюме дефекта:");
                    resumeArrayInfo[bugIndex] = in.nextLine();
                    System.out.println("Выберите критичность дефекта:");
                    for (int i = 0; i < SEVERITY_ARRAY.length; i++) {
                        System.out.println((i + 1) + ". " + SEVERITY_ARRAY[i]);
                    }
                    int choice = in.nextInt();
                    while (choice > SEVERITY_ARRAY.length || choice <= 0) {
                        System.out.println("Необходимо выбрать порядковый номер критичности от 1 до " + SEVERITY_ARRAY.length);
                        choice = in.nextInt();
                    }
                    severityArrayInfo[bugIndex] = SEVERITY_ARRAY[choice - 1];

                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    daysToFixArrayInfo[bugIndex] = in.nextInt();
                    bugIndex++;
                } else {
                    System.out.println("Невозможно добавить новый дефект. Количество дефектов максимальное.\n");
                }
            } else if (action == 2) {
                if (bugIndex == 0) {
                    System.out.println("Дефекты отсутствуют.\n");
                } else {
                    for (int i = 0; i < bugIndex; i++) {
                        System.out.println("[" + (i) + "] " + "Резюме: " + resumeArrayInfo[i] +
                                " | Критичность: " + severityArrayInfo[i] +
                                " | Дней на исправление: " + daysToFixArrayInfo[i] +
                                " | Исправление займёт больше рабочей недели: " + (daysToFixArrayInfo[i] > WORK_WEEK));
                    }
                    System.out.println("\n");
                }
            }
        } while (action != 3);
    }
}