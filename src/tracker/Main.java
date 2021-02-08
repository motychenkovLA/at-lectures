package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите резюме дефекта:");
        //переменная для резюме
        String resume = in.nextLine();
        System.out.println("Введите критичность дефекта: \n 1. Блокирующий \n 2. Высокий \n 3. Средний \n 4. Низкий");
        //переменная для критичности
        String criticality = in.nextLine();
        System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
        //переменная для срока исправления
        int date = in.nextInt();
        String info = "Резюме: " + resume + " | Критичность: " + criticality + " | Дней на исправление: " + date
                + " | Исправление займёт больше рабочей недели: " + (date > 5);
        System.out.println(info);
    }
}