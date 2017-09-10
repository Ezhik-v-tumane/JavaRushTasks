package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1816/1.txt";

        List<String> arr = new ArrayList<String>();

        int count = 0;

        FileInputStream file = new FileInputStream(fileName);

        while (file.available() > 0){
         arr.add(String.valueOf(file.read()));

        }
        for (int i = 0; i < arr.size(); i++){
            int intTmp = Integer.parseInt(arr.get(i));
            char a = (char) intTmp;
            if (String.valueOf(a).matches("^[a-zA-Z]+$"))
                count++;
        }

        System.out.println(count);

        file.close();

    }
}
