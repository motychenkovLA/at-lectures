package tracker;

public class Defect {
    private final long id;
    private String summary;
    private String criticality;
    private int days;
    private static int count = 0;

    public Defect(String summary, String criticality, int days) {
        this.id = count;
        count++;
        this.summary = summary;
        this.criticality = criticality;
        this.days = days;
    }

    public String display() {
        return "номер дефекта:  " + id + " | резюме: " + summary + " | серьезность: "
                + criticality + " | количество дней на исправление " + days;
    }
}
