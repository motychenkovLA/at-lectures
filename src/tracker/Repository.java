package tracker;

public class Repository {
    private int maxBugsCount;
    private static int bugId = 0;
    private final Defect[] defect;

    public Repository(int maxBugsCount) {
        this.maxBugsCount = maxBugsCount;
        this.defect = new Defect[maxBugsCount];
    }

    public void add(Defect defect) {
        this.defect[bugId] = defect;
        bugId++;
    }

    public void getAll() {
        if (Repository.getBugsCount() == 0) {
            System.out.println("Дефекты отсутствуют.");
        } else {
            for (int i = 0; i < Repository.getBugsCount(); i++) {
                defect[i].getDefectInfo();
            }
        }
    }

    public static int getBugsCount() {
        return bugId;
    }
}