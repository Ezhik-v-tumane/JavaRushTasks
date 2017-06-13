package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int minVol = 2147483647;
        int maxVol = -2147483648;
        int minIndx = 0, maxIndx = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            String listStr = reader.readLine();
            list.add(listStr);

        }

        //ищем минимальный размер строки и ее индекс
        for (int i = 0; i < 10; i++)
        {
            if (list.get(i).length() < minVol)
            {
                minVol = list.get(i).length();
                minIndx = i;
            }

        }

        //ищем максимальный размер строки и ее индекс
        for (int i = 0; i < 10; i++)
        {
            if (list.get(i).length() > maxVol)
            {
                maxVol = list.get(i).length();
                maxIndx = i;
            }
        }

        if (minIndx < maxIndx)
        {
            System.out.println(list.get(minIndx));
        }
        else if (maxIndx < minIndx)
            System.out.println(list.get(maxIndx));
        //System.out.println("minIndx: " + minIndx + "; maxIndx: " + maxIndx + " " + maxVol + " " + minVol);
    }
}
