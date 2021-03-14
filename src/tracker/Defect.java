package tracker;

public class Defect {
    private final long bugIndex;
    private static long id = 0;
    private final String resume;
    private final String severity;
    private final int daysToFix;
    private Attachment attachment;

    public Defect(String resume, String severity, int daysToFix, Attachment attachment) {
        this.bugIndex = id++;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
        this.attachment = attachment;
    }

    public Defect(String resume, String severity, int daysToFix) {
        this.bugIndex = id++;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
    }

    public String toString() {
        if (this.attachment == null) {
            return ("[" + (bugIndex) + "] " + "Резюме: " + resume + " | Критичность: " + severity +
                    " | Дней на исправление: " + daysToFix + "\n");
        } else {
            return ("[" + (bugIndex) + "] " + "Резюме: " + resume + " | Критичность: " + severity +
                    " | Дней на исправление: " + daysToFix + " | Вложение: " + attachment.asString() + "\n");
        }
    }
}