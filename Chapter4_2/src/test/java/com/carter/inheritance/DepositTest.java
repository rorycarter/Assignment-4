package com.carter.inheritance;

import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-03-29.
 */
public class DepositTest {
    private TransInter acc;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccConfig.class);
        acc = (TransInter)ctx.getBean("deposit");
    }
    @Test
    public void testDepositExecute() throws Exception {
        Assert.assertEquals(15000.00, acc.execute(5000.00), 00);
    }
}