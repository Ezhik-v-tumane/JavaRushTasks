package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1801/1.txt";
        String fileName = reader.readLine();
        //BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        FileInputStream file = new FileInputStream(fileName);
        int max = -2147483648;
        while (file.available() > 0){
            int intTmp = file.read();
            if (intTmp > max)
                max = intTmp;

        }
        reader.close();
        file.close();
        System.out.println(max);
    }
}
