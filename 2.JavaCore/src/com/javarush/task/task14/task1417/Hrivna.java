package com.javarush.task.task14.task1417;

/**
 * Created by sergeymyskov on 11.03.17.
 */
public class Hrivna extends Money {
    //private double amount;

    public Hrivna(double amount) {
        super(amount);
    }

    public double getAmount() {
        return 5;
    }

    public String getCurrencyName(){
        return "HRN";
    }
}
