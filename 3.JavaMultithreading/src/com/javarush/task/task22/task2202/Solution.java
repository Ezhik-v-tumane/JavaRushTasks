package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        if (string.split("[ ]+").length < 5){
            throw new TooShortStringException();
        }
        /*int firstIndex = string.indexOf(" ");
        int lastIndex = string.lastIndexOf(" ");*/

        String[] arr = string.split(" ");


        return arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4];
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
