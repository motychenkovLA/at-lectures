package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int act;
        int CONST = 5;
        int totalBugs = 0;
        int MAX_COUNT_BUGS = 10;

        Defect[] bugs = new Defect[MAX_COUNT_BUGS];
        long id = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Меню багтрекера:\n1.Создать новый дефект\n2.Список дефектов\n3.Выход из программы");
            act = in.nextInt();
            in.nextLine();
            if (act == 1) {
                if (totalBugs < MAX_COUNT_BUGS) {
                    System.out.println("Просьба заполнить резюме дефекта");
                    String summary= in.nextLine();
                    System.out.println("Просьба выбрать критичность дефекта\n- Блокирующий\n- Критический\n- Средний\n" +
                            "-" + " Низкий");
                    String priority  = in.nextLine();
                    System.out.println("Просьба ввести ожидаемое количество дней на исправление дефекта");
                    int days = in.nextInt();
                    in.nextLine();
                    bugs[totalBugs] = new Defect((id+1), summary, priority, days);
                    id++;

                } else System.out.println("Программа максимально может хранить до 10 дефектов");

            } else if (act == 2) {
                if (id > 0) { ;
                    for (int i = 0; i < totalBugs; i++) ;
                    bugs[totalBugs].listOfDefects();

                }else System.out.println("Список дефектов пуст");

            }
        }
        while (act != 3);
    }
}
