package com.javarush.task.task14.task1417;

/**
 * Created by sergeymyskov on 11.03.17.
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 15;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
