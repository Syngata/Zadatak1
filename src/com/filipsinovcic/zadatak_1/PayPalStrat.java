package com.filipsinovcic.zadatak_1;

public class PayPalStrat implements PaymentStrategyIfc{
    public PayPalStrat(){

    }

    @Override
    public String payment() {
        return "PayPal payment";
    }
}
