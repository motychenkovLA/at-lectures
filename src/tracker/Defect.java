package tracker;

public class Defect {
    long id;
    String summary;
    String criticality;
    int days;
    public String display() {
        return "номер дефекта:  " + id + " | резюме: " + summary + " | серьезность: "
                + criticality + " | количество дней на исправление " + days;
    }
}
