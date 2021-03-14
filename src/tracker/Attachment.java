package tracker;

/**
 *

 Задание:
 - при создании дефекта также предложить пользователю выбрать тип вложения: комментарий или ссылка на другой дефект
 - при вводе комментария принять от пользователя строку
 - при вводе ссылки на дефект принять id этого дефекта
 - прикрепление реализовать в виде класса Attachment с двумя наследниками CommentAttachment для комментария и DefectAttachment для ссылки на дефект
 - в классе Attachment создать метод String asString(), возвращающий его строковое представление, переопределить метод в наследниках
 - при выводе дефекта на консоль выводить также и вложение, используя его метод asString




 * */

public class Attachment {
    private final String attachment;

    public Attachment(String attachment){
        this.attachment = attachment;
    }

    public String asString(){
        return attachment;
    }
}
