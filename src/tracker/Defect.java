package tracker;

public class Defect {

    /* создать класс Defect для представления дефекта с полями: id (long), резюме, серьезность, количество дней на исправление
     при создании экземпляра дефекта поле id заполнять порядковым номером созданного дефекта
     при выводе списка дефекты отображаются в виде "id | резюме | серьезность | количество дней на исправление"
     */
    public final static int WORK_WEEK = 5;
    private long id;
    private String resume;
    private String severity;
    private long dueDates;

    public Defect(long id, String resume, String severity, long dueDates) {
        this.id = id;
        this.resume = resume;
        this.severity = severity;
        this.dueDates = dueDates;
    }

   /* public String setResume (String resume){
       return this.resume = resume;
   }

    public void setCriticality (String criticality){
     this.severity = criticality;
   }

    public void setCorrectionDate (int correctionDate){
       this.correctionDate = correctionDate;
   }

   public String getResume (){
       return resume;
   }

    public String getCriticality (){
        return severity;
    }

    public int  getCorrectionDate(){
        return correctionDate;
    }*/

    public long getId() {
        return id;
    }

    public void getInfo() {
        System.out.println(id + " | Резюме: " + resume + " | Критичность дефекта: "
                + severity + " | Количество дней на исправление: " + dueDates);
                //+ " | Исправление дефекта займет больше рабочей недели: " + (dueDates > WORK_WEEK));
    }

}
