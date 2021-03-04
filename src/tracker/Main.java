package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] bugList = new String[10];
        boolean continueProgram = true;
        String mainInfo = "\nВведите необходимую цифру для действия\n1. Добавить новый дефект\n2. Вывести список дефектов\n3. Выход из программы";

        do {
            System.out.println(mainInfo);
            String selectAction = in.nextLine();

            switch (selectAction) {
                case "1":
                    for (int i = 0; i < bugList.length; i++) {
//                        if (bugList[9] == null) {
                        if (bugList[i] == null) {
//                        if (ArrayUtils.nullToEmpty(bugList[10]) == null) {
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
                            bugList[i] = bugInfo;
                            System.out.println();
                            break;
                        }else {
                            System.out.println("Достигнут лимит по количеству дефектом. Максимально в системе может быть 10 дефектов");
                            continue;
                        }
                    }
                    break;
                case "2":
                    for (int i = 0; i < 10; i++) {
                        System.out.println();
                        System.out.println((i) + " - " + bugList[i]);
                    }
                    break;
                case "3":
                    continueProgram = false;
                    continue;
            }
        } while (continueProgram);

    }

}
