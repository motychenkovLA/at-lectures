package tracker;

public class Attachment {

    private final String attachment;

    public Attachment(String attachment) {
        this.attachment = attachment;
    }

    public String asString() {
        return attachment;
    }
}