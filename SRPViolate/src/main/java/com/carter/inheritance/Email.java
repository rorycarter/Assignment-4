package com.carter.inheritance;

/**
 * Created by Rory on 2017-03-30.
 */
public class Email implements EmailInterface {

    private String sender;
    private String reciever;
    private String content;

    public void setSender(String sender) {

        this.sender = sender;
    }

    public void setReceiver(String reciever) {

        this.reciever = reciever;
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
        return reciever;
    }

    public String getContent()
    {
        return content;
    }

    public String toString()
    {
        return String.format("Sender: %s\n Receiver: %s\n Message: %s", getSender(),getReceiver(),getContent());
    }

}
