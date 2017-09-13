package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1822/1.txt";
        String fileName = reader.readLine();

        BufferedReader file = new BufferedReader(new FileReader(fileName));

        while (file.ready()){
            String tmp = file.readLine();
            if (tmp.startsWith(args[0])) {
                System.out.println(tmp);
            }
        }
        file.close();
        reader.close();


    }
}
