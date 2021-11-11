package com.filipsinovcic.zadatak_1;

public class CreditCardStrat implements PaymentStrategyIfc{
    public CreditCardStrat(){

    }
    @Override
    public String payment() {
        return "Credit card payment";
    }
}
