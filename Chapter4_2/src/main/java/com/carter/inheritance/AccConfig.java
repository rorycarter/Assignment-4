package com.carter.inheritance;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
/**
 * Created by Rory on 2017-03-29.
 */
@Configuration
public class AccConfig {

    @Bean(name="deposit")
    public TransInter getDeposit(){
        return new Deposit(222333444, 10000.00);
    }

    @Bean(name="withdraw")
    public TransInter getWithdraw(){
        return new Withdraw(111333222, 5000.00);
    }

}
