package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int act;
        int maxCountDefects = 10;
        Repository defects = new Repository(maxCountDefects);

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Меню багтрекера:\n1.Создать новый дефект\n2.Список дефектов\n3.Выход из программы");
            act = in.nextInt();
            in.nextLine();
            if (act == 1) {
                if (defects.getCountDefects() < maxCountDefects) {
                    System.out.println("Просьба заполнить резюме дефекта");
                    String summary = in.nextLine();
                    System.out.println("Просьба выбрать критичность дефекта\n- Блокирующий\n- Критический\n- Средний\n" +
                            "-" + " Низкий");
                    String priority = in.nextLine();
                    System.out.println("Просьба ввести ожидаемое количество дней на исправление дефекта");
                    int days = in.nextInt();
                    in.nextLine();
                    defects.add(new Defect(summary, priority, days));

                } else{
                    System.out.println("Программа максимально может хранить до " + maxCountDefects + " дефектов");
                     }
            } else if (act == 2) {
                defects.getAll();
            }
        }
        while (act != 3);
    }
}
