package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/1.txt";
        //String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/2.txt";
        //String fileName3 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/3.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream file1 = new FileOutputStream(fileName1, true);
        FileInputStream file2 = new FileInputStream(fileName2);
        FileInputStream file3 = new FileInputStream(fileName3);

        byte[] buffer2 = new byte[1000];
        while (file2.available() > 0){
            int count2 = file2.read(buffer2);
            file1.write(buffer2, 0, count2);
        }
        byte[] buffer3 = new byte[1000];
        while (file3.available() > 0){
            int count3 = file3.read(buffer3);
            file1.write(buffer3,0, count3);
        }

        file1.close();
        file2.close();
        file3.close();
        reader.close();

    }
}
