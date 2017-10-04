package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/1.txt";
        //String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/2.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()){
            String tmpLine = fileReader.readLine();
            String[] wordsArr = tmpLine.split("\\s");

            for (String s : wordsArr){
                if (s.matches("^[0-9]+"))
                    fileWriter.write(s + " ");

            }
        }


        fileReader.close();
        fileWriter.close();



    }
}
