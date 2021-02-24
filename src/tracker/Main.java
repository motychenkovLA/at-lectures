package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        final int week = 5;
//        final int maxDefects = 2;
//        int count = 0;
        Scanner sc = new Scanner(System.in);
        Repository repository = new Repository(2);
        String summary;
        String criticality;
        int days;

        do {
            System.out.println("Для добавления нового дефекта ввведите \"add\" \nДля просмотра списка дефектов введите \"list\" \nДля выхода из программы введите \"quit\" ");
            String menu = sc.nextLine();
            if (menu.equals("add")) {

                    System.out.println("Введите резюме дефекта:");
                    summary = sc.nextLine();

                    System.out.println("Введите критичность дефекта (блокирующая, критическая, средняя, низкая):");
                    criticality = sc.nextLine();

                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    days = sc.nextInt();
                    sc.nextLine();
                    Defect defect = new Defect(summary, criticality, days);
                    repository.add(defect);
           }
            else if (menu.equals("list")) {
                    repository.printAll();
            }
            else if (menu.equals("quit")) {
                break;
            }
        } while (true) ;
    }
}