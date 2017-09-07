package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1803/1.txt";
        String byteStr = "";
        String fileName = reader.readLine();

        FileInputStream file = new FileInputStream(fileName);

        while (file.available() > 0){
            int intTmp = file.read();
            arr.add(intTmp);
        }
        reader.close();
        file.close();
        Set<Integer> set = new HashSet<Integer>(arr);
        ArrayList<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++){
            if (byteStr.equals("")){
                byteStr = String.valueOf(result.get(i));
            } else {
                byteStr = byteStr + " " + String.valueOf(result.get(i));
            }
        }
        System.out.println(byteStr);

    }
}
