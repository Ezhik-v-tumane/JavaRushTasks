package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        even = 0;
        odd = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();

        int [] myArray = new int [sNum.length()];
        for (int i = 0; i < sNum.length(); i++)
        {
            myArray[i]=Integer.valueOf(sNum.charAt(i)).intValue();
        }
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] % 2 > 0)
                odd++;
            else
                even++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
