package com.filipsinovcic.zadatak_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	User usr= new User("Jakov", "oi21", "Grad", "HR",new ArrayList<String>(
            Arrays.asList("Mail", "Promo", "Discount")), true);
	usr.choosePayment(new GooglePayStrat());
	usr.showInfo();
    }
}
