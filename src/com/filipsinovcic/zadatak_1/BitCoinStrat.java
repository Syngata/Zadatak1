package com.filipsinovcic.zadatak_1;

public class BitCoinStrat implements PaymentStrategyIfc{
    public BitCoinStrat(){
    }
    @Override
    public String payment() {
        return "BitCoin payment";
    }
}
