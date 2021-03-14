package tracker;

public class DefectAttachment extends Attachment {
    private final long attachment;

    public DefectAttachment(long attachment) {
        super(Long.toString(attachment));
        this.attachment = attachment;
    }

    @Override
    public String asString() {
        return "Ссылка на дефект - " + this.attachment;
    }
}