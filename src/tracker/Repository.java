package tracker;

public class Repository {
    private final int maxCountDefects;
    private Defect[] defects;
    private int countDefects=0;

    public Repository(int maxCountDefects){
        this.maxCountDefects = maxCountDefects;
        this.defects = new Defect[maxCountDefects];
    }
    public void add (Defect defect){
        this.defects[countDefects] = defect;
        countDefects++;
    }
    public void getAll(){
        if (countDefects > 0) { ;
            for (int i = 0; i < countDefects; i++)
                defects[i].listOfDefects();
    }else System.out.println("Список дефектов пуст");


    }
    public int getCountDefects(){
        return countDefects;
    }

}
