package tracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //создаем объект класса сканнер
        Scanner sc = new Scanner(System.in);
        //переменные resume - описание дефекта, choice-критичность дефекта
        String resume, choice;
        //переменная кол-ва дней
        int correctionDate;
        System.out.println("Укажите резюме дефекта:");
        //ввод с клавиатуры описания дефекта
        resume = sc.nextLine();
        System.out.print("Укажите критичность дефекта:\nБлокирующий\nВысокий\nСредний\nНизкий\nКритичность: ");
        //ввод с клаиватуры критичности дефекта
        choice = sc.nextLine();
        System.out.println("Укажите ожидаемое количество дней на исправление дефекта");
        //ввод кол-ва дней исправления дефекта
        correctionDate = sc.nextInt();
        System.out.println("Резюме: " + resume + " | Критичность дефекта: " + choice +
                " | Количество дней на исправление: " + correctionDate +
                " | Исправление дефекта займет больше рабочей недели: " + (correctionDate > 5));
    }
}
