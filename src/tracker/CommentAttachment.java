package tracker;

public class CommentAttachment extends Attachment {

    private final String attachment;

    public CommentAttachment(String attachment) {
        super(attachment);
        this.attachment = attachment;
    }

    @Override
    public String asString() {
        return "Комментарий - " + attachment;
    }
}
