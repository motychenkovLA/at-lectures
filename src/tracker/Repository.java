package tracker;

import java.util.Arrays;

public class Repository {
    private final int maxBugsCount;
    private int bugId = 0;
    private final Defect[] defect;

    public Repository(int maxBugsCount) {
        this.maxBugsCount = maxBugsCount;
        this.defect = new Defect[maxBugsCount];
    }

    public void add(Defect defect) {
        this.defect[bugId] = defect;
        bugId++;
    }

    public int getBugsCount() {
        return bugId;
    }

    public int getMaxBugsCount() {
        return maxBugsCount;
    }

    public Defect[] getAll() {
        return Arrays.copyOf(defect, getBugsCount());
    }
}