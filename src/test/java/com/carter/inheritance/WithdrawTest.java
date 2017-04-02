package com.carter.inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-29.
 */
public class WithdrawTest {
    private TransInter t;
    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        t = (TransInter)ctx.getBean("withdraw");
    }

    @Test
    public void execute() throws Exception {

        Assert.assertEquals(2500.00, t.execute(2500.00), 00);

    }

}