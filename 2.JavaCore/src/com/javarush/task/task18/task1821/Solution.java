package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1821/1.txt";

        Map<Character, Integer> map = new TreeMap<>();

        FileInputStream file = new FileInputStream(fileName);

        int r;
        while ((r = file.read()) != -1) {
            char ch = (char) r;
            if (map.containsKey(ch)){
                int i = map.get(ch);
                map.put(ch, i + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character name: map.keySet()){

            String key =name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);


        }
        System.out.println();

        file.close();
    }
}
