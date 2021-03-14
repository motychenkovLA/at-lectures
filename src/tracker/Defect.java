package tracker;

public class Defect {

    /* создать класс Defect для представления дефекта с полями: id (long), резюме, серьезность, количество дней на исправление
     при создании экземпляра дефекта поле id заполнять порядковым номером созданного дефекта
     при выводе списка дефекты отображаются в виде "id | резюме | серьезность | количество дней на исправление"
     */
    public final static int WORK_WEEK = 5;
    private final long id;
    private final String resume;
    private final String severity;
    private final long dueDates;
    private static int defectId = 0;
    private Attachment attachment;

    public Defect(String resume, String severity, long dueDates) {
        this.id = defectId++;
        this.resume = resume;
        this.severity = severity;
        this.dueDates = dueDates;
     }

    public Defect(String resume, String severity, long dueDates, Attachment attachment) {
        this.id = defectId++;
        this.resume = resume;
        this.severity = severity;
        this.dueDates = dueDates;
        this.attachment = attachment;
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
    }

    public long getId() {
        return id;
    }*/

    public void getInfo() {
        if(attachment == null){
            System.out.println((id +1) + " | Резюме: " + resume + " | Критичность дефекта: "
                    + severity + " | Количество дней на исправление: " + dueDates);
        }
        else{
        System.out.println((id +1) + " | Резюме: " + resume + " | Критичность дефекта: "
                + severity + " | Количество дней на исправление: " + dueDates + " " + attachment.asString());
        }
                //+ " | Исправление дефекта займет больше рабочей недели: " + (dueDates > WORK_WEEK));
    }

}
