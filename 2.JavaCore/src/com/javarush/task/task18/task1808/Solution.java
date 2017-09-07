package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/1.txt";
        //String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/2.txt";
        //String fileName3 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/3.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        if (file1.available() % 2 == 0){

            byte[] buffer = new byte[file1.available() / 2];
            int count = file1.read(buffer);
            file2.write(buffer,0, count);

            byte[] buffer2 = new byte[file1.available()];
            int count2 = file1.read(buffer);
            file3.write(buffer,0, count2);

        } else {
            byte[] buffer = new byte[((file1.available() - 1) / 2) + 1 ];
            int count = file1.read(buffer);
            file2.write(buffer,0, count);

            byte[] buffer2 = new byte[file1.available()];
            int count3 = file1.read(buffer2);

            file3.write(buffer2, 0, count3);

        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();

    }
}
