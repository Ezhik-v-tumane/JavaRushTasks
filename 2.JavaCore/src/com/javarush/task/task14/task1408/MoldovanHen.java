package com.javarush.task.task14.task1408;

/**
 * Created by sergeymyskov on 01.03.17.
 */
public class MoldovanHen extends Hen {

    public int getCountOfEggsPerMonth() {
        return 2;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}