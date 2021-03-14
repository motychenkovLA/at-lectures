package tracker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_AMOUNT_BUGS = 10;
        final String[] SEVERITY_ARRAY = {"Блокирующий", "Высокий", "Средний", "Низкий"};

        int action;
        Repository repository = new Repository(MAX_AMOUNT_BUGS);

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Выберите действие: \n1. Добавить новый дефект \n2. Вывести список дефектов \n3. Выйти из программы");

            //как добавить игнорирование эксепшена при вводе в консоли строки??
            action = in.nextInt();
            in.nextLine(); // считываем конец строки, чтобы можно было следующим вводить в консоли String

            if (action == 1) {
                if (repository.getBugsCount() < repository.getMaxBugsCount()) {
                    System.out.println("Введите резюме дефекта:");
                    String resume = in.nextLine();
                    System.out.println("Выберите критичность дефекта:");
                    for (int i = 0; i < SEVERITY_ARRAY.length; i++) {
                        System.out.println((i + 1) + ". " + SEVERITY_ARRAY[i]);
                    }
                    int choice = in.nextInt();
                    while (choice > SEVERITY_ARRAY.length || choice <= 0) {
                        System.out.println("Необходимо выбрать порядковый номер критичности от 1 до " + SEVERITY_ARRAY.length);
                        choice = in.nextInt();
                    }
                    String severity = SEVERITY_ARRAY[choice - 1];
                    System.out.println("Введите ожидаемое количество дней на исправление дефекта:");
                    int daysToFix = in.nextInt();

                    System.out.println("Добавить вложение?\n1. Да\n2. Нет");
                    int needAttachment = in.nextInt();
                    in.nextLine();
                    while (needAttachment != 1 & needAttachment != 2) {
                        System.out.println("Необходимо выбрать вариант 1 или 2");
                        needAttachment = in.nextInt();
                        in.nextLine();
                    }
                    if (needAttachment == 1) {
                        System.out.println("Выберите тип вложения:\n1. Комментарий\n2. Ссылка на дефект");
                        int choiceAttachment = in.nextInt();
                        in.nextLine();
                        while (choiceAttachment != 1 & choiceAttachment != 2) {
                            System.out.println("Необходимо выбрать вариант 1 или 2");
                            choiceAttachment = in.nextInt();
                            in.nextLine();
                        }
                        Attachment attachment;
                        if (choiceAttachment == 1) {
                            System.out.println("Введите комментарий");
                            String comment = in.nextLine();
                            attachment = new CommentAttachment(comment);
                        } else {
                            System.out.println("Введите ссылку на дефект (номер дефекта)");
                            long reference = in.nextLong();
                            in.nextLine();
                            attachment = new DefectAttachment(reference);
                        }
                        repository.add(new Defect(resume, severity, daysToFix, attachment));
                    } else {
                        repository.add(new Defect(resume, severity, daysToFix));
                    }
                } else {
                    System.out.println("Невозможно добавить новый дефект. Максимальное количество дефектов - " + repository.getMaxBugsCount() + "\n");
                }
            } else if (action == 2) {
                if (repository.getBugsCount() == 0) {
                    System.out.println("Дефекты отсутствуют.\n");
                } else {
                    System.out.println(Arrays.toString(repository.getAll()) + "\n");
                }
            }
        }
        while (action != 3);
    }
}