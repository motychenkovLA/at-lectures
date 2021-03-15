package tracker;

import java.util.Scanner;

public class Main {

    static final int MAX_SIZE_DEFECT_LIST = 10;
    static Scanner in = new Scanner(System.in);
    final static String MAIN_INFO = "\nВведите необходимую цифру для действия\n1. Добавить новый дефект\n" +
            "2. Вывести список дефектов\n3. Выход из программы";

    static Repository repository = new Repository(MAX_SIZE_DEFECT_LIST);
    static Defect defect = new Defect();


    public static void main(String[] args) {

        while (true) {

            System.out.println(MAIN_INFO);
            String selectAction = in.nextLine();

            if (selectAction.equals("1")) {
                repository.add(defect);

            } else if (selectAction.equals("2")) {
                repository.getAll();

            } else if (selectAction.equals("3")) {
                break;

            } else {
                System.out.println();
                System.out.println("Введено не корректное число. Введите число действия из списка");
            }
        }
    }
}

