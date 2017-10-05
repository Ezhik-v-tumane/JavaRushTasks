package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName1 = "C://Java//src//com//javarush//task//task19//task1909//1.txt";
        //String fileName2 = "C://Java//src//com//javarush//task//task19//task1909//2.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            //String tmpLine = line;
            String tmpLine = line.replaceAll("[.]", "!");
            bufferedWriter.write(tmpLine + "\r\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
