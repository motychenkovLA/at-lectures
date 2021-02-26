package tracker;

import java.sql.SQLOutput;

public class Defect {
    private long id;
    private  String summary;
    private  String priority;
    private  int days;

    public Defect(String summary, String priority, int days) {
        this.summary = summary;
        this.priority = priority;
        this.days = days;
        this.id = id;
    }

        public void listOfDefects() {
            System.out.println("Номер дефекта " + id + " | Резюме: " + summary + " | Критичность дефекта: "
                    + priority + " | Количество дней на исправление: " + days);
             }



    }

