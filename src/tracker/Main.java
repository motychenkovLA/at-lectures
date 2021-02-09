package tracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите краткое описание дефекта:");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Выберите критичность дефекта:");
        System.out.println("Блокирующий");
        System.out.println("Высокий");
        System.out.println("Средний");
        System.out.println("Низкий");
        String b = in.nextLine();
        System.out.println("Введите ожидаемое количество дней на исправление дефекта");
        int c = in.nextInt();
        System.out.println("Информация о дефекте:");
        System.out.println(a);
        System.out.println("Критичность:");
        System.out.println(b);
        System.out.println("Исправление займет больше одной рабочей недели:");
        System.out.println(c>=5);


    }

}
