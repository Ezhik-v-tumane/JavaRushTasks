package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) throws IOException {

        List<String> arr = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/1.txt";
        //String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/2.txt";

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        reader.close();

        BufferedReader file1 = new BufferedReader(new FileReader(fileName1));



        while (file1.ready()){
            arr.add(file1.readLine());
        }

        ArrayList<Long> values = new ArrayList<Long>();
        for (String s : arr) {
            for (String part : s.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }
        file1.close();

        FileWriter file2 = new FileWriter(fileName2);
        for (Long value : values)
            file2.write( value.toString()+" ");

        file2.close();

    }
}
