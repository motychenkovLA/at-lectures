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
        Defect[] SUMMARY_OF_DEFECT = new Defect[10];
        boolean continueProgram = true;
        final String MAIN_INFO = "\nВведите необходимую цифру для действия\n1. Добавить новый дефект\n2. Вывести список дефектов\n3. Выход из программы";

        while (continueProgram) {

            System.out.println(MAIN_INFO);
            String selectAction = in.nextLine();

            switch (selectAction) {
                case "1":
                    for (int i = 0; true; i++) {
                        if (SUMMARY_OF_DEFECT[9] == null) {

                            final int WORKING_WEEK = 5;

                            System.out.println("Введите резюме дефекта");
                            String resume = in.nextLine();
                            System.out.println();

                            System.out.println("Выберите и введите критичность дефекта из списка\n1. Блокирующий\n2. Критический\n3. Средний\n4. Низкий\n5. Тривиальный");
                            String severity = in.nextLine();
                            System.out.println();

                            System.out.println("Введите ожидаемое количество дней на исправление дефекта");
                            int daysToFix = in.nextInt();
                            System.out.println();
                            boolean result = daysToFix  > WORKING_WEEK;

                            String bugInfo = "Описание дефекта - " + resume + "\nКритичность дефекта - " + severity + "\nДней на исправление - " + daysToFix + "\nИсправление займет больше рабочей недели - " + result;
                            System.out.println(bugInfo);
                            Defect bug = new Defect();
                            SUMMARY_OF_DEFECT[i] = bug.setBug(i + 1, resume, severity, daysToFix);
//                            BUG_LIST[i] = bugInfo;
//                            BUG_LIST[i] = bug;
                            break;
                        }else {
                            System.out.println("Достигнут лимит по количеству дефектом. Максимально в системе может быть 10 дефектов");
                            break;
                        }
                    }
                    break;
                case "2":
                    for (int i = 0; i < SUMMARY_OF_DEFECT.length; i++) {
                        System.out.println();
                        System.out.println(SUMMARY_OF_DEFECT[i]);
                    }

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
