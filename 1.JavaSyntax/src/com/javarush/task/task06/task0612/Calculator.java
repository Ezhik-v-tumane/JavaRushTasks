package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        //напишите тут ваш код
        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int raz = a - b;
        return raz;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mult = a * b;
        return mult;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) (a * b / 100);
    }

    public static void main(String[] args) {

    }
}