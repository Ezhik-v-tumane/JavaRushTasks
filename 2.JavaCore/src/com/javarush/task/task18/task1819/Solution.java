package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1819/1.txt";
        //String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1819/2.txt";

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        reader.close();

        ByteArrayOutputStream memory = new ByteArrayOutputStream();

        fileToMemory(memory, fileName2);
        fileToMemory(memory, fileName1);

        FileOutputStream file = new FileOutputStream(fileName1);

        memory.writeTo(file);

        file.close();


    }

    public static void fileToMemory(ByteArrayOutputStream memory, String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        byte[] buffer = new byte[1000];
        while (file.available() > 0){
            int count = file.read(buffer);
            memory.write(buffer, 0, count);
        }
        file.close();
    }
}
