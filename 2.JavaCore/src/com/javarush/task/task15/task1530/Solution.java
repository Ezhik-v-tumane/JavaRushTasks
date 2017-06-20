package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker a = new TeaMaker();
        LatteMaker b = new LatteMaker();

        a.pour();
        b.getRightCup();
        a.putIngredient();
        a.getRightCup();
        b.pour();
        b.putIngredient();

    }
}
