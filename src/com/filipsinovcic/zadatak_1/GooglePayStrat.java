package com.filipsinovcic.zadatak_1;

public class GooglePayStrat implements PaymentStrategyIfc{
    public GooglePayStrat(){

    }

    @Override
    public String payment() {
        return "Google Play payment";
    }
}
