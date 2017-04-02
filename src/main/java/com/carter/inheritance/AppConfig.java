package com.carter.inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
/**
 * Created by Rory on 2017-03-28.
 */
public class AppConfig {
    @Bean(name="deposit")
    public TransInter getDeposit()
    {
        return new Deposit(222,10000.00);
    }

    @Bean(name="withdraw")
    public TransInter getWithdraw(){
        return new Withdraw(111,5000.00);
    }



}
