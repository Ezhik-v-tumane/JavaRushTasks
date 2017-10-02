package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String nameFile1 = reader.readLine();
        //String nameFile1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1906/1.txt";

        String nameFile2 = reader.readLine();
        //String nameFile2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1906/2.txt";
        reader.close();

        FileReader fileReader = new FileReader(nameFile1);
        FileWriter fileWriter = new FileWriter(nameFile2);

        int i = 1;
        while (fileReader.ready()){
            int data = fileReader.read();
            if (i % 2 == 0)
                fileWriter.write(data);
            i++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
