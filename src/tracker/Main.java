package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        int addAttachment;
        int attachmentType;
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

                    System.out.println("Добавить вложение в дефект?\n1. Да\n2. Нет");
                    addAttachment = sc.nextInt();
                    sc.nextLine();
                    if (addAttachment == 1){
                        Attachment attachment;
                        System.out.println("Выберите тип вложения\n1. Комментарий\n2. Ссылка на дефект\n");
                        attachmentType = sc.nextInt();
                        sc.nextLine();
                        if (attachmentType == 1){
                            System.out.println("Введите комментарий");
                            String commentary = sc.nextLine();
                            attachment = new CommentAttachment(commentary);
                            defectList.add(new Defect(resume, severity, dueDates, attachment));
                        }
                         else {
                            System.out.println("Укажите ID дефект, на который ссылаетесь");
                            long defectId = sc.nextLong();
                            attachment = new DefectAttachment(defectId);
                            defectList.add(new Defect(resume, severity, dueDates, attachment));
                         }
                    } else {
                        defectList.add(new Defect(resume, severity, dueDates));
                    }
                }
                else {
                    System.out.println("\nНевозможно создать более " + maxCountDefects + " дефектов\n");
                }
            } else if (userChoice == 2) {
                defectList.getAll();
            }
        } while (userChoice != 3);
        sc.close();
    }
}