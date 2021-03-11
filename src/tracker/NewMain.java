package tracker;

import java.util.Arrays;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        final int SIZE_BUG_LIST = 10;
        Scanner in = new Scanner(System.in);
        String[] BUG_LIST = new String[SIZE_BUG_LIST];
        int index = 0;
        boolean continueProgram = true;
        final String MAIN_INFO = "\nВведите необходимую цифру для действия\n1. Добавить новый дефект\n2. Вывести список дефектов\n3. Выход из программы";

        while (continueProgram) {

            System.out.println(MAIN_INFO);
            String selectAction = in.nextLine();

            if (selectAction.equals("1")) {
                for (int i = 0; BUG_LIST[9] == null; i++) {

                    final int WORKING_WEEK = 5;

                    System.out.println("Введите резюме дефекта");
                    String summaryOfDefect = in.nextLine();
                    System.out.println();

                    System.out.println("Выберите и введите критичность дефекта из списка\n1. Блокирующий\n2. Критический\n3. Средний\n4. Низкий\n5. Тривиальный");
                    String priorityDefect = in.nextLine();
                    System.out.println();

                    System.out.println("Введите ожидаемое количество дней на исправление дефекта");
                    int daysToFix = in.nextInt();
                    System.out.println();
                    boolean result = daysToFix > WORKING_WEEK;

                    String bugInfo = "Описание дефекта - " + summaryOfDefect + "\nКритичность дефекта - " + priorityDefect + "\nДней на исправление - " + daysToFix + "\nИсправление займет больше рабочей недели - " + result;
                    System.out.println(bugInfo);
                    BUG_LIST[i] = bugInfo;
                    index++;
                    System.out.println();
                    break;
                }

            } else if (index == SIZE_BUG_LIST) {

                System.out.println("Достигнут лимит по количеству дефектом. Максимально в системе может быть 10 дефектов");
                break;

            } else if (selectAction.equals("2")) {
                    for (int i = 0; i < BUG_LIST.length; i++) {
                        System.out.println();
                        System.out.println((i) + " - " + BUG_LIST[i]);
                    }
            } else if (selectAction.equals("3")) {
                    continueProgram = false;
                    break;
            } else {
                System.out.println();
                System.out.println("Введите цифру действия из списка");
            }
        }
    }
}

