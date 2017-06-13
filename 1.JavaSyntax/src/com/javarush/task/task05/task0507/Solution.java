package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, count = 0;

        while (true)
        {
            String tempStr = reader.readLine();
            if (tempStr.equals("-1"))
                break;
            else
            {
                int a = Integer.parseInt(tempStr);
                count++;
                sum = sum + a;
            }

        }
        System.out.println((double) sum/count);
    }
}

