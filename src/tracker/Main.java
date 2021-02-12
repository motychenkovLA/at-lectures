package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //выбор клиента
        int userChoice = 0;
        //счетчик кол-ва дефектов
        int countBugs = 0;
        //константа кол-ва дней в рабочей неделе
        final int WORK_WEEK = 5;
        //константа кол-ва дефектов
        final int MAX_COUNT_BUGS = 10;
        //создаем объект класса сканнер
        Scanner sc = new Scanner(System.in);
        // переменная Резюме
        String resume = null;
        //переменная Критичность
        String criticality = null;
        //переменная кол-ва дней на исправление дефектов
        int correctionDate;
        //лишняя переменная
        int cryticalNumber;
        //массив дефектов
        String arrayOfBugs[] = new String[10];

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
                    resume = sc.nextLine();
                    do{
                        cryticalNumber = 0;
                    System.out.print("----------\nВыберите приоритет дефекта:\n1. Блокирующий\n2. Высокий\n" +
                            "3. Средний\n4. Низкий\nУкажите приоритет дефекта: ");
                    //ввод с клаиватуры критичности дефекта
                        cryticalNumber = sc.nextInt();
                    switch (cryticalNumber){
                        case 1:
                            criticality = "Блокирующий";
                            System.out.println("\nВыбранный приоритет дефекта = " + criticality);
                            break;
                        case 2:
                            criticality = "Высокий";
                            System.out.println("\nВыбранный приоритет дефекта = " + criticality);
                            break;
                        case 3:
                            criticality = "Средний";
                            System.out.println("\nВыбранный приоритет дефекта = " + criticality);
                            break;
                        case  4:
                            criticality = "Низкий";
                            System.out.println("\nВыбранный приоритет дефекта = " + criticality);
                            break;
                        default:
                            System.out.println("\nУказан некорректный приоритет дефекта!" +
                                    "\nВведите критичность дефекта от 1 до 4.\n");
                    }
                        }while(cryticalNumber < 1 || cryticalNumber > 4);
                    System.out.println("----------\nУкажите ожидаемое количество дней на исправление дефекта");
                    //ввод кол-ва дней исправления дефекта
                    correctionDate = sc.nextInt();
                    sc.nextLine();
                    //запись в элемент массива информации по дефекту
                    arrayOfBugs[countBugs] = "Дефект № " + (countBugs + 1) + " | Резюме: " + resume + " | Критичность дефекта: " +
                            criticality + " | Количество дней на исправление: " + correctionDate +
                            " | Исправление дефекта займет больше рабочей недели: " + (correctionDate > WORK_WEEK);
                    //увеличиваем счетчик дефектов на 1
                    countBugs++;
                } else System.out.println("Невозможно создать более 10 дефектов");
            } else if (userChoice == 2) {
                if (countBugs > 0) {
                    System.out.println(countBugs);
                    for (int i = 0; i < countBugs; i++) System.out.println(arrayOfBugs[i]);
                } else System.out.println("----------\nСписок дефектов пуст\n----------");
            }
        }
            while (userChoice != 3);
    }
}

