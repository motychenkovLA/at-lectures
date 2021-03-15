package tracker;

public class Defect {
    private long id = 0;
    private String description;
    private String severity;
    private int daysToFix;


    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setDaysToFix(int daysToFix) {
        this.daysToFix = daysToFix;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public int getDaysToFix() {
        return daysToFix;
    }

    public Defect() {
        this.id = id++;

    }
}
