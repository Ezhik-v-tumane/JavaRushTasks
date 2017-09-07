package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1807/1.txt";
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);

        int count = 0;

        while (file.available() > 0){
            int intTmp = file.read();
            arr.add(intTmp);
        }
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).equals(44))
                count++;
        }

        reader.close();
        file.close();

        System.out.println(count);
    }
}
