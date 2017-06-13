package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while (!(text=reader.readLine()).equals("exit"))
        {

            if(text.matches("^-?\\d+\\.\\d+")){
                print(Double.parseDouble(text));
            }

            else if(text.matches("^-?\\d+$")){
                Integer number = Integer.valueOf(text);
                if (number > 0 & number < 128)
                    print(Short.parseShort(text));
                else
                    print(number);
            }
            else
                print(text);
        }

        reader.close();
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
