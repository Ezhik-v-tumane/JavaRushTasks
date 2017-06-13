package com.javarush.task.task14.task1408;

/**
 * Created by sergeymyskov on 01.03.17.
 */
public class RussianHen extends Hen {

    public int getCountOfEggsPerMonth() {
        return 3;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
