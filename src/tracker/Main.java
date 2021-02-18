package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        //счетчик кол-ва дефектов
        int countBugs = 0;
        final int MAX_COUNT_BUGS = 10;
        //создаем объект класса сканнер
        Scanner sc = new Scanner(System.in);
        Defect[] bugs = new Defect[MAX_COUNT_BUGS];

        do {
            System.out.print("Доступные действия:\n1. Добавить дефект\n2. Вывести список дефектов" +
                    "\n3. Выйти из программы\nВыберите действие: ");
            userChoice = sc.nextInt();
            //добавляем nextLine() после nextInt, nextShort и т.д.,
            // для последующего использования nextLine()
            sc.nextLine();
            if (userChoice == 1) {
                if(countBugs < MAX_COUNT_BUGS) {
                    System.out.print("\nУкажите резюме дефекта: ");
                    String resume = sc.nextLine();
                    System.out.print("\nВыберите приоритет дефекта:\n1. Блокирующий\n2. Высокий\n3. Средний" +
                            "\n4. Низкий\nУкажите приоритет дефекта: ");
                    //ввод с клаиватуры критичности дефекта
                    String severity = sc.nextLine();
                  System.out.println("\nУкажите ожидаемое количество дней на исправление дефекта");
                    int dueDates = sc.nextInt();
                    sc.nextLine();
                    bugs [countBugs] = new Defect(countBugs +1, resume, severity, dueDates);
                    countBugs++;
                } else {
                    System.out.println("\nНевозможно создать более 10 дефектов\n");
                }
            } else if (userChoice == 2) {
                if (countBugs > 0) {
                    for (int i = 0; i < countBugs; i++) {
                        System.out.println(bugs[i].getId());
                        bugs[i].getInfo();
                    }
                } else {
                    System.out.println("\nСписок дефектов пуст\n");
                }
            }
        } while (userChoice != 3);
    }
}

