package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1803/1.txt";
        String fileName = reader.readLine();

        int min = 2147483647;
        int prvMin = 2147483647;
        int tmp;
        String minBite = "";

        FileInputStream file = new FileInputStream(fileName);

        while (file.available() > 0){
            int intTmp = file.read();
            arr.add(intTmp);
        }

        for (int i = 0; i < arr.size(); i++){
            tmp = Collections.frequency(arr, arr.get(i)); //подсчитываем количество совпадений элемента в списке
            if (min >= tmp){
                min = tmp;
                if (min < prvMin){
                    minBite = String.valueOf(arr.get(i));
                    prvMin = min;
                } else if (min == prvMin){
                    minBite = minBite + " " + String.valueOf(arr.get(i));
                }

            }
        }

        reader.close();
        file.close();

        String[] arrStr = minBite.split(" ");

        Set<String> set = new HashSet<String>(Arrays.asList(arrStr));
        String[] result = set.toArray(new String[set.size()]);

        minBite = "";

        for (int i = 0; i < result.length; i++){
            if (i == 0)
                minBite = result[i];
            else
                minBite = minBite + " " + result[i];
        }

        System.out.println(minBite);


    }
}
