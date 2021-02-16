package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int bugsnum = 0;
        final int MAXVALUE = 10;
        Scanner in = new Scanner(System.in);
        String[] description = new String[MAXVALUE];
        String[] severity = new String[MAXVALUE];
        int[] days = new int[MAXVALUE];

        while (bugsnum < MAXVALUE) {

            System.out.println("Выберите действие: Добавить новый дефект(add)|Вывести список дефектов(list)|Выйти из программы(quit)");
            String choice = in.nextLine();

            if ("add".equals(choice)) {
                System.out.println("Введите краткое описание дефекта:");
                description[bugsnum] = in.nextLine();
                System.out.println("Выберите критичность дефекта:");
                System.out.println("Блокирующий");
                System.out.println("Высокий");
                System.out.println("Средний");
                System.out.println("Низкий");
                severity[bugsnum] = in.nextLine();
                System.out.println("Введите ожидаемое количество дней на исправление дефекта");
                days[bugsnum] = in.nextInt();
                bugsnum++;

            }
            else if (choice.equals("list")) {
                for (int i=0;i<bugsnum;i++) {
                    System.out.println("Номер дефекта: " + i + ", Описание дефекта:" + description[0] + ", Критичность:" + severity[0] + ", Количество дней на выпосление: " + days[0]);

                }
            }
            if (choice.equals("quit")) {
                break;

            }

        }
        in.close();

    }
}
