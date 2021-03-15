package tracker;

import java.util.Scanner;

public class Repository {
    static Scanner in = new Scanner(System.in);
    static int defectID = 0;
    static final int MAX_SIZE_DEFECT_LIST = 10;
    final static int WORKING_WEEK = 5;
    static Defect[] defectList = new Defect[MAX_SIZE_DEFECT_LIST];
    final static String[] DEFECT_SEVERITY = new String[]{"1. Блокирующий\n", "2. Критический\n", "3. Средний\n",
            "4. Низкий\n", "5. Тривиальный\n"};

    public Repository(int MAX_SIZE_DEFECT_LIST) {
        this.defectList = new Defect[MAX_SIZE_DEFECT_LIST];
    }

    public void add(Defect defect) {
        if (defectID < MAX_SIZE_DEFECT_LIST) {
            System.out.println("Введите резюме дефекта");
            defect.setDescription(in.nextLine());
            System.out.println();

            System.out.println("Выберите и введите критичность дефекта из списка\n" + DEFECT_SEVERITY[0] +
                    DEFECT_SEVERITY[1] + DEFECT_SEVERITY[2] + DEFECT_SEVERITY[3] + DEFECT_SEVERITY[4]);
            defect.setSeverity(in.nextLine());
            System.out.println();

            System.out.println("Введите ожидаемое количество дней на исправление дефекта");
            defect.setDaysToFix(in.nextInt());
            in.nextLine();
            System.out.println();

            defectList[defectID] = defect;
            defectID++;

        } else {
            System.out.println("Достигнут лимит по количеству дефектом. Максимально в системе может быть "
                    + MAX_SIZE_DEFECT_LIST + " дефектов");
        }
    }

    public Defect[] getAll() {
        for (int i = 0; i < defectID; i++) {
            boolean moreThanWorkingWeek = false;
            if (defectList[i].getDaysToFix() > WORKING_WEEK) {
                moreThanWorkingWeek = true;
            }
            String bugInfo = "\nНомер дефекта - " + i + "\nОписание дефекта - " + defectList[i].getDescription() +
                    "\nКритичность дефекта - " + defectList[i].getSeverity() + "\nДней на исправление - "
                    + defectList[i].getDaysToFix() + "\nИсправление займет больше рабочей недели - " + moreThanWorkingWeek;
            System.out.println(bugInfo);
        }
        return defectList;
    }
}
