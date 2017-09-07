package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1803/1.txt";
        String fileName = reader.readLine();

        int max = -2147483648;
        int tmp;
        String maxBite = "";

        FileInputStream file = new FileInputStream(fileName);

        while (file.available() > 0){
            int intTmp = file.read();
            arr.add(intTmp);
        }
        for (int i = 0; i < arr.size(); i++){
            tmp = Collections.frequency(arr, arr.get(i));
            if (tmp >= max){
                max = tmp;
                if (maxBite.equals("")){
                    maxBite = String.valueOf(arr.get(i));
                } else {
                    maxBite = maxBite + " " + String.valueOf(arr.get(i));
                }
            }
        }
        reader.close();
        file.close();
        String[] arrStr = maxBite.split(" ");

        Set<String> set = new HashSet<String>(Arrays.asList(arrStr));
        String[] result = set.toArray(new String[set.size()]);

        maxBite = "";

        for (int i = 0; i < result.length; i++){
            if (i == 0)
                maxBite = result[i];
            else
                maxBite = maxBite + " " + result[i];
        }

        System.out.println(maxBite);
    }
}
