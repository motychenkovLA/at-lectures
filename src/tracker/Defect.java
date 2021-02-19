package tracker;

import java.sql.SQLOutput;

public class Defect {
    protected long id;
    protected String summary;
    protected String priority;
    protected int days;

    public Defect(long id, String summary, String priority, int days) {
        this.summary = summary;
        this.priority = priority;
        this.days = days;
        this.id = id;
    }

        public void listOfDefects() {
            System.out.println("Номер дефекта " + id + " | Резюме: " + summary + " | Критичность дефекта: "
                    + priority + " | Количество дней на исправление: " + days);
             }


//        public String getSummary() {
//            return summary;
//        }
//
//        public String getPriority() {
//            return priority;
//        }
//
//        public int getDays() {
//            return days;
//        }

    }

