package tracker;

public class Repository {
    private final int maxDefects;
    private Defect[] defects;
    private int countDefects=0;

    public Repository(int maxDefects){
        this.maxDefects = maxDefects;
        this.defects = new Defect[maxDefects];
    }
    public void add (Defect defect){
        if (countDefects < maxDefects){
            defects[countDefects] = defect;
            countDefects++;
        } else System.out.println("Нет возможности ввода более " +maxDefects+ " дефектов");


    }
    public void printAll(){
     for (int i = 0; i < countDefects; i++)
        System.out.println(defects[i].display());
    }
    public Defect[] getAll(){
        return defects;
    }
}
