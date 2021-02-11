package tracker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Константы
        // рабочая неделя
        final int WORK_WEEK = 5;
        //максимальное количество дефектов
        final int MAX_AMOUNT_BUGS = 10;
        // массив возможных критичностей дефекта
        final String[]  CRITICALITY_ARRAY= {"Блокирующий", "Высокий", "Средний", "Низкий"};

        // массив дефектов
        String[] arrayOfBugs = new String[10];
        int bug = 0;

        Scanner in = new Scanner(System.in);
        //переменная выбора действия
        int action;

        do {

            System.out.println("Выберите действие: \n 1. Добавить новый дефект \n 2. Вывести список дефектов \n 3. Выйти из программы");

            //как добавить игнорирование эксепшена при вводе в консоли строки??

            action = in.nextInt();
            in.nextLine(); // считываем конец строки, чтобы можно было следующим вводить в консоли String

            if (action == 1 && bug < MAX_AMOUNT_BUGS){
                System.out.println("Введите резюме дефекта:");
                String resume = in.nextLine();
                System.out.println("Выберите критичность дефекта: \n 1. Блокирующий \n 2. Высокий \n 3. Средний \n 4. Низкий");
                //ввод критичности из консоли
                int choice = in.nextInt();
                //переменная для критичности
                String criticality;
                //отображать сообщение только если введено некорректное значение критичности
                if (choice > CRITICALITY_ARRAY.length || choice <= 0){
                    do {
                        System.out.println("Необходимо выбрать порядковый номер критичности от 1 до " + CRITICALITY_ARRAY.length);
                        choice = in.nextInt();
                    } while (choice > CRITICALITY_ARRAY.length || choice <= 0);
                    criticality = CRITICALITY_ARRAY[choice - 1];
                } else {
                    criticality = CRITICALITY_ARRAY[choice - 1];
                }

                System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                //переменная для срока исправления
                int date = in.nextInt();
                String info = "[" + (bug) + "] " + "Резюме: " + resume + " | Критичность: " + criticality + " | Дней на исправление: " + date
                        + " | Исправление займёт больше рабочей недели: " + (date > WORK_WEEK);
                arrayOfBugs[bug] = info;
                bug++;
            } else if (action == 2) {
                if (bug == 0){
                    System.out.println("Дефекты отсутствуют.\n");
                } else {
                    for (int i = 0; i < bug; i++) {
                        System.out.println(arrayOfBugs[i]);
                    }
                    System.out.println("\n");
                }

            } else if (action == 1 && bug >= MAX_AMOUNT_BUGS){
                System.out.println("Невозможно добавить новый дефект. Количество дефектов максимальное.\n");
            }

        } while (action != 3);

    }
}