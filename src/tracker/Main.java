package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int CONST = 5;
        boolean t;

        Scanner ra = new Scanner(System.in);
        System.out.println("Введите резюме дефекта:");
        String r = ra.nextLine();

        Scanner ca = new Scanner(System.in);
        System.out.println("Введите критичность дефекта (блокирующая, критическая, средняя, низкая):");
        String c = ca.nextLine();

        Scanner da = new Scanner(System.in);
        System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
        int d = da.nextInt();
        t = (d > CONST);

            System.out.println("резюме " +r+ " | серьезность " +c+ " | количество дней на исправление " +d+ " | займет больше рабочей недели " +t);


    }

}
