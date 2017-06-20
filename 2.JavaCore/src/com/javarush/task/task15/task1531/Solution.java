package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String strFact;
        BigDecimal fact = BigDecimal.ONE;
        BigDecimal tmpFact;
        if (n < 0)
            strFact = "0";
        else if (n == 0)
            strFact = "1";
        else {
            for (int i = 0; i < n; i++){
                tmpFact = fact.multiply(BigDecimal.valueOf(i+1));
                fact = tmpFact;
            }
            strFact = fact.toString();

        }
        return strFact;
        //add your code here


    }
}
