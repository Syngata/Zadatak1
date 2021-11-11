package com.filipsinovcic.zadatak_1;

public class CashOnDeliveryStrat implements PaymentStrategyIfc{
    public CashOnDeliveryStrat(){

    }

    @Override
    public String payment() {
        return "Cash on delivery payment";
    }
}
