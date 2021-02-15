package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //выбор клиента
        int userChoice;
        //счетчик кол-ва дефектов
        int countBugs = 0;
        //константа кол-ва дней в рабочей неделе
        final int WORK_WEEK = 5;
        //константа кол-ва дефектов
        final int MAX_COUNT_BUGS = 10;
        //создаем объект класса сканнер
        Scanner sc = new Scanner(System.in);

        //массив описания дефектов
        String arrayOfResume[] = new String[MAX_COUNT_BUGS];
        String arrayOfCriticality[] = new String[MAX_COUNT_BUGS];
        int arrayOfCorrectionDate[] = new int[MAX_COUNT_BUGS];

        do {
            System.out.print("Доступные действия:\n1. Добавить дефект\n2. Вывести список дефектов" +
                    "\n3. Выйти из программы\nВыберите действие: ");
            userChoice = sc.nextInt();
            //добавляем nextLine() после nextInt, nextShort и т.д., для последующего использования nextLine()
            sc.nextLine();
            if (userChoice == 1) {
                if(countBugs < MAX_COUNT_BUGS) {
                    System.out.println("----------\nУкажите резюме дефекта: ");
                    //ввод с клавиатуры описания дефекта
                    arrayOfResume[countBugs]= sc.nextLine();
                    System.out.print("----------\nВыберите приоритет дефекта:\n1. Блокирующий\n2. Высокий\n" +
                            "3. Средний\n4. Низкий\nУкажите приоритет дефекта: ");
                    //ввод с клаиватуры критичности дефекта
                    arrayOfCriticality[countBugs] = sc.nextLine();
                  System.out.println("----------\nУкажите ожидаемое количество дней на исправление дефекта");
                    //ввод кол-ва дней исправления дефекта
                    arrayOfCorrectionDate[countBugs]= sc.nextInt();
                    sc.nextLine();
                    //увеличиваем счетчик дефектов на 1
                    countBugs++;
                } else System.out.println("----------\nНевозможно создать более 10 дефектов\n----------");
            } else if (userChoice == 2) {
                if (countBugs > 0) {
                    System.out.println(countBugs);
                    for (int i = 0; i < countBugs; i++)
                    System.out.println("Дефект № " + (i+1) + " | Резюме: " + arrayOfResume[i] + " | Критичность дефекта: " +
                            arrayOfCriticality[i] + " | Количество дней на исправление: " + arrayOfCorrectionDate[i] +
                            " | Исправление дефекта займет больше рабочей недели: " + (arrayOfCorrectionDate[i] > WORK_WEEK));
                } else System.out.println("----------\nСписок дефектов пуст\n----------");
            }
        }
            while (userChoice != 3);
    }
}

