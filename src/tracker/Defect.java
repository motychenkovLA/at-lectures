package tracker;

public class Defect {
    private long bugIndex;
    private String resume;
    private String severity;
    private int daysToFix;

    public Defect(long bugIndex, String resume, String severity, int daysToFix) {
        this.bugIndex = bugIndex;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
    }

    public void getDefectInfo() {
        System.out.println("[" + (bugIndex + 1) + "] " + "Резюме: " + resume + " | Критичность: " + severity +
                " | Дней на исправление: " + daysToFix);
    }

}