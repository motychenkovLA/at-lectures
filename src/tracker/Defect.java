package tracker;

public class Defect {
    private long id;
    private String resume;
    private String severity;
    private int daysToFix;
    public Defect[] BUG_LIST = new Defect[10];

//    public Defect(Defect[] BUG_LIST) {
//        this.BUG_LIST = BUG_LIST;
//    }



//    public Defect(long id, String resume, String severity, int daysToFix) {
//        this.id = id;
//        this.resume = resume;
//        this.severity = severity;
//        this.daysToFix = daysToFix;
//    }

    public Defect setBug(long id, String resume, String severity, int daysToFix){
        this.id = id;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
        return null;
    }

    public Defect[] getBUG_LIST() {
        return BUG_LIST;
    }
}
