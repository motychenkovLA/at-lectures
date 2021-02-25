package tracker;

public class Defect {
    private final long bugIndex;
    private final String resume;
    private final String severity;
    private final int daysToFix;
    private static long id = 0;

    public Defect(String resume, String severity, int daysToFix) {
        this.bugIndex = id++;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
    }

    public void getDefectInfo() {
        System.out.println("[" + (bugIndex) + "] " + "Резюме: " + resume + " | Критичность: " + severity +
                " | Дней на исправление: " + daysToFix);
    }
}