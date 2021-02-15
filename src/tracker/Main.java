package tracker;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //запуск программы
        do {
            Scanner in = new Scanner(System.in);

            System.out.println("Меню багтрекера:\n1.Создать новый дефект\n2.Список дефектов\n3.Выход из программы");
            act = in.nextInt();//клиент выбирает, что хочет сделать
            in.nextLine();
            if (act == 1) {
                if (totalBugs < MAX_COUNT_BUGS) {
                    //создание дефекта
                    System.out.println("Просьба заполнить резюме дефекта");
                    arraysummary[totalBugs]  = in.nextLine();
                    //String summary = in.nextLine();
                    System.out.println("Просьба выбрать критичность дефекта\n- Блокирующий\n- Критический\n- Средний\n- Низкий");
                    arraypriority [totalBugs]  = in.nextLine();
                    System.out.println("Просьба ввести ожидаемое количество дней на исправление дефекта");
                    arraydays [totalBugs]  = in.nextInt();
                    in.nextLine();
                    totalBugs++;//количество дефектов увеличивается на 1

                } else System.out.println("Программа максимально может хранить до 10 дефектов");
                //+автоматический возврат в главное меню
            } else if (act == 2) {
                if (totalBugs > 0) { //вывод списка дефектов
                    System.out.println(totalBugs);
                    for (int i = 0;i < totalBugs;i++)
                        System.out.println("Номер дефекта "+(i+1)+" |Резюме: "+ arraysummary[i] + " |Серьезность: " + arraypriority[i] + "|Количество дней на исправление: " + arraydays[i] + "|Займет больше рабочей недели: " +(arraydays[i]>CONST));
                } else System.out.println("Список дефектов пуст"); //дефектов нет
                //+автоматический возврат в главное меню
            }
        }
        while (act != 3);
    }
}


