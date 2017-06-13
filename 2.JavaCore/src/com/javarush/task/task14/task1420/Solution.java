package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        while (true){
            try {
                a = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
            }
            if (a <= 0) {
                System.out.println("Необходимо ввести положительное цисло больше нуля");
            } else
                break;

        }
        while (true){
            try {
                b = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
            }
            if (b <= 0) {
                System.out.println("Необходимо ввести положительное цисло больше нуля");
            } else
                break;

        }
        reader.close();

        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
