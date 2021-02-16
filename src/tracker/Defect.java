package tracker;

public class Defect {

   /* создать класс Defect для представления дефекта с полями: id (long), резюме, серьезность, количество дней на исправление
    при создании экземпляра дефекта поле id заполнять порядковым номером созданного дефекта
    при выводе списка дефекты отображаются в виде "id | резюме | серьезность | количество дней на исправление"
    */

   private long id = 0;
   private String resume;
   private String criticality;
   private int correctionDate;

   public Defect (String resume, String criticality, int correctionDate){
       this.id++;
       this.resume = resume;
       this.criticality = criticality;
       this.correctionDate = correctionDate;
   }



}
