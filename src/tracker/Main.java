package tracker;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Просьба заполнить резюме дефекта");
        String summary = in.nextLine();
        System.out.println("Просьба выбрать критичность дефекта");
        System.out.println("- Блокирующий");
        System.out.println("- Критический");
        System.out.println("- Средний");
        System.out.println("- Низкий");
        String priority = in.next();
        System.out.println("Просьба ввести ожидаемое количество дней на исправление дефекта");
        int days = in.nextInt();
        int week = 5;
        boolean correction = days > week;
        System.out.print("Резюме: "+ summary + "|Серьезность: "+ priority + "|Количество дней на исправление: "+ days + "|Займет больше рабочей недели: "+ correction );

    }

}
