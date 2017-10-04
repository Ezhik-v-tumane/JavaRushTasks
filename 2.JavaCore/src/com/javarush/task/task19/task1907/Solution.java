package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        String word = "world";
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1907/1.txt";
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()){
            String tmpLine = fileReader.readLine();
            String[] wordsArr = tmpLine.toString().split("\\W");
            for (String s : wordsArr){
                if (s.equals(word))
                    count++;
            }
        }

        fileReader.close();

        System.out.println(count);

    }
}
