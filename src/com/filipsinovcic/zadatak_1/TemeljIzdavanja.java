package com.filipsinovcic.zadatak_1;

public abstract class TemeljIzdavanja {
    protected PaymentStrategyIfc psIfc;

    public TemeljIzdavanja(){
    }

    protected String choosePayment(PaymentStrategyIfc psIfc){
        this.psIfc=psIfc;
        return this.psIfc.payment();
    }


}
