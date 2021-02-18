package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        final int week = 5;
        final int bugs = 2;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Defect[] defects = new Defect[bugs];
//        String[] summary = new String[bugs];
//        String[] criticality = new String[bugs];
//        int[] days = new int[bugs];

        do {
            System.out.println("Для добавления нового дефекта ввведите \"add\" \nДля просмотра списка дефектов введите \"list\" \nДля выхода из программы введите \"quit\" ");
            String menu = sc.nextLine();
            if (menu.equals("add")) {
                if (count < bugs) {
                    defects[count] = new Defect();
                    defects[count].id = count+1;
                    System.out.println("Введите резюме дефекта:");
                    defects[count].summary = sc.nextLine();

                    System.out.println("Введите критичность дефекта (блокирующая, критическая, средняя, низкая):");
                    defects[count].criticality = sc.nextLine();

                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    defects[count].days = sc.nextInt();
                    sc.nextLine();
                    count++;
                } else System.out.println("Нет возможности ввода более " +bugs+ " дефектов");
           }
            else if (menu.equals("list")) {
                    for (int i = 0; i < count; i++) {
                        System.out.println(defects[i].display());
                    }
            }
            else if (menu.equals("quit")) {
                break;
            }
        } while (true) ;
    }
}