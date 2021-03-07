package tracker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void getBugList(String... arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.println((i) + " - " + arg[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String[] BUG_LIST = new String[10];
//        final int BUG_LIST = 10;
        boolean continueProgram = true;
        final String MAIN_INFO = "\nВведите необходимую цифру для действия\n1. Добавить новый дефект\n2. Вывести список дефектов\n3. Выход из программы";

        while (continueProgram) {

            System.out.println(MAIN_INFO);
            String selectAction = in.nextLine();

            switch (selectAction) {
                case "1":
                    for (int i = 0; i < BUG_LIST.length; i++) {
                        if (BUG_LIST[9] == null) {
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
                            System.out.println ();
                            break;
                        }else {
                            System.out.println("Достигнут лимит по количеству дефектом. Максимально в системе может быть 10 дефектов");
                            break;
                        }
                    }
                    break;
                case "2":
                    for (String bug : BUG_LIST) {
                        System.out.println(Arrays.toString(BUG_LIST));
                    }

//                    for (int i = 0; i < BUG_LIST.length; i++) {
//                        System.out.println();
//                        System.out.println((i) + " - " + BUG_LIST[i]);
//                        System.out.println((i) + " - " + Arrays.toString(BUG_LIST));
//                    }
//                    getBugList(BUG_LIST);

                    break;
                case "3":
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Введите цифру действия из списка");
                    break;
            }
        }
    }

}
