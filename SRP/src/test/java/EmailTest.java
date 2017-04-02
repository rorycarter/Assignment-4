import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Rory on 2017-03-30.
 */
public class EmailTest {
    ContentInterface content;
    EmailInterface email;
    @Before
    public void setUp() throws Exception {

        content = new Email();
        email = new Email();
    }

    @Test
    public void setSender() throws Exception {
        email.setSender("rorycarterit@gmail.com");
        Assert.assertEquals("rorycarterit@gmail.com","rorycarterit@gmail.com");


    }

    @Test
    public void setReceiver() throws Exception {

        email.setReceiver("213241463@mycput.ac.za");
        Assert.assertEquals("213241463@mycput.ac.za","213241463@mycput.ac.za");
    }

    @Test
    public void setContent() throws Exception {
        email.setContent("Hey");
        Assert.assertEquals("Hey", "Hey");
    }

}