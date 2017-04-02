/**
 * Created by Rory on 2017-03-30.
 */
public class run {
    public static void main(String[] args)
    {
        EmailInterface email = new Email();
        ContentInterface emailContent = new Email();
        email.setSender("rorycarterit@gmail.com");
        email.setReceiver("213241463@mycput.ac.za");
        email.setContent("This is a test email");
        System.out.println(emailContent.toString());
    }
}
