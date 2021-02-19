package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAXVALUE = 10;
        int bugsnum = 0;
        Defect[] defects = new Defect[MAXVALUE];

        long defId = 0;


        Scanner in = new Scanner(System.in);
        while (bugsnum < MAXVALUE) {

            System.out.println("Выберите действие: Добавить новый дефект(add)|Вывести список дефектов(list)|Выйти из программы(quit)");
            String choice = in.nextLine();

            if ("add".equals(choice)) {
                System.out.println("Введите краткое описание дефекта:");
                String description = in.nextLine();
                System.out.println("Выберите критичность дефекта:");
                System.out.println("Блокирующий");
                System.out.println("Высокий");
                System.out.println("Средний");
                System.out.println("Низкий");
                String severity = in.nextLine();
                System.out.println("Введите ожидаемое количество дней на исправление дефекта");
                int days = in.nextInt();
                defects[bugsnum] = new Defect(bugsnum, description, severity, days);
                bugsnum++;


            } else if ("list".equals(choice)) {
                for (int i=0;i<bugsnum;i++) {
                    defects[i].DefInfo();

                }
            } else if (choice.equals("quit")) {
                break;

            }

        }
        in.close();

    }
}
