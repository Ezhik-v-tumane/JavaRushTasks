package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }
    String s1;
    int i1;
    short sh1;
    double d1;

    public Solution(String s1) {
        this.s1 = s1;
    }

    protected Solution(String s1, int i1) {
        this.s1 = s1;
        this.i1 = i1;
    }

    Solution(String s1, int i1, short sh1) {
        this.s1 = s1;
        this.i1 = i1;
        this.sh1 = sh1;
    }

    private Solution(String s1, int i1, short sh1, double d1) {
        this.s1 = s1;
        this.i1 = i1;
        this.sh1 = sh1;
        this.d1 = d1;
    }
}

