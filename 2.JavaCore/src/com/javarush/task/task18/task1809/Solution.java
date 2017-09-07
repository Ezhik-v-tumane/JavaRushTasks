package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/1.txt";
        String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/2.txt";

        //String fileName1 = reader.readLine();
        //String fileName2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);

        while (file1.available() > 0){
            int intTmp = file1.read();
            arr.add(intTmp);
        }

        for (int i = 0; i < arr.size(); i++){
            file2.write(arr.get(arr.size() - 1 - i));
        }

        reader.close();
        file1.close();
        file2.close();

    }
}
