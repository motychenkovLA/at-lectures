package tracker;

import java.util.Scanner;

public class Defect {



        private long defId;
        private int days;
        private String description;
        private String severity;

        public Defect(long defId, String description, String severity, int days) {
            this.defId = defId;
            this.description = description;
            this.severity = severity;
            this.days = days;
        }

        public void DefInfo(){
            System.out.println("№"+ defId + " | Описание: " + description + " | Критичность: " + severity
            + " | Количество дней на исправление: " + days);
        }


}
