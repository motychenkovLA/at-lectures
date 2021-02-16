package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int week = 5;
        int bugs = 10;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String[] summary = new String[bugs];
        String[] criticality = new String[bugs];
        int days[] = new int[bugs];

        do {
            System.out.println("Для добавления нового дефекта ввведите \"add\" \nДля просмотра списка дефектов введите \"list\" \nДля выхода из программы введите \"quit\" ");
            String menu = sc.nextLine();
            if (menu.equals("add")) {
                if (count < bugs) {
                    System.out.println("Введите резюме дефекта:");
                    summary[count] = sc.nextLine();

                    System.out.println("Введите критичность дефекта (блокирующая, критическая, средняя, низкая):");
                    criticality[count] = sc.nextLine();

                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    days[count] = sc.nextInt();
                    sc.nextLine();
                    count++;
                } else System.out.println("Нет возможности ввода более 10 дефектов");
           }
            else if (menu.equals("list")) {
                    for (int i = 0; i < count; i++) {
                        System.out.println("номер дефекта:  " + (i+1) + " | резюме: " + summary[0] + " | серьезность: " + criticality[0] + " | количество дней на исправление " + days[0]);
                    }
                } else if (menu.equals("quit")) {
                    break;
                }
            }
            while (count != bugs) ;
              }
}