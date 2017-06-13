package com.javarush.task.task14.task1408;

/**
 * Created by sergeymyskov on 01.03.17.
 */
public class UkrainianHen extends Hen {

    public int getCountOfEggsPerMonth() {
        return 4;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
