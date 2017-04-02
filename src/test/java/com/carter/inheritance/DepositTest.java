package com.carter.inheritance;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-03-29.
 */
public class DepositTest {

    private TransInter ti;
    @Before
    public void setUp() throws Exception
    {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
            ti = (TransInter)ctx.getBean("deposit");


    }

    @Test
    public void execute() throws Exception
    {
        Assert.assertEquals(15000.00, ti.execute(5000.00), 00);



    }

}