package tracker;

public class Repository {
    private final int maxCountDefects;
    private Defect[] defectList;
    private int countDefect = 0;

    public Repository(int maxCountDefects){
        this.maxCountDefects = maxCountDefects;
        this.defectList = new Defect[maxCountDefects];
    }

    public void add(Defect defect){
            defectList[countDefect] = defect;
            countDefect++;
    }

    public int getCountDefect(){
        return countDefect;
    }

    public int getMaxCountDefect(){
        return maxCountDefects;
    }

    public void getAll(){
        if (countDefect > 0) {
            for (int i = 0; i < countDefect; i++) {
                defectList[i].getInfo();
            }
        } else {
            System.out.println("\nСписок дефектов пуст\n");
        }
    }
}
