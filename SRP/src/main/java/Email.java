
/**
 * Created by Rory on 2017-03-30.
 */
public class Email implements EmailInterface,ContentInterface
{

    private String sender;
    private String receiver;
    private String content;

    public String toString() {

        return String.format("Sender: %s\n Receiver: %s\n Message: %s", getSender(),getReceiver(),getContent());
    }

    public void setSender(String sender) {

        this.sender = sender;
    }

    public void setReceiver(String receiver) {

        this.receiver = receiver;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getSender()
    {
        return sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public String getContent()
    {
        return content;
    }
}
