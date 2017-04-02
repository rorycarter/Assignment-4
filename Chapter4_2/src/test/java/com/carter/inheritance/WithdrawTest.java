package com.carter.inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-30.
 */
public class WithdrawTest {
    private TransInter a;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccConfig.class);
        a = (TransInter)ctx.getBean("withdraw");
    }
    @Test
    public void testWithdrawExecute() throws Exception {
        Assert.assertEquals(2500.00, a.execute(2500.00), 00);

    }

}