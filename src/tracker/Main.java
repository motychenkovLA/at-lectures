package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        //счетчик кол-ва дефектов
//        int countBugs = 0;
  //      final int MAX_COUNT_BUGS = 10;
        //создаем объект класса сканнер
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество дефектов: ");
        int maxCountDefects = sc.nextInt();
        sc.nextLine();
        Repository defectList = new Repository(maxCountDefects);

        do {
            System.out.print("Доступные действия:\n1. Добавить дефект\n2. Вывести список дефектов" +
                    "\n3. Выйти из программы\n\nВыберите действие: ");
            userChoice = sc.nextInt();
            //добавляем nextLine() после nextInt, nextShort и т.д.,
            // для последующего использования nextLine()
            sc.nextLine();
            if (userChoice == 1) {
                if (defectList.getCountDefect() < defectList.getMaxCountDefect()){
                    System.out.print("\nУкажите резюме дефекта: ");
                    String resume = sc.nextLine();
                    System.out.print("\nВыберите приоритет дефекта:\n1. Блокирующий\n2. Высокий\n3. Средний" +
                            "\n4. Низкий\nУкажите приоритет дефекта: ");
                    //ввод с клаиватуры критичности дефекта
                    String severity = sc.nextLine();
                  System.out.println("\nУкажите ожидаемое количество дней на исправление дефекта");
                    int dueDates = sc.nextInt();
                    sc.nextLine();
                    defectList.add(new Defect(resume,severity,dueDates));
                }
                else {
                    System.out.println("\nНевозможно создать более " + maxCountDefects + " дефектов\n");
                }
            } else if (userChoice == 2) {
                defectList.getAll();
            }
        } while (userChoice != 3);
    }
}