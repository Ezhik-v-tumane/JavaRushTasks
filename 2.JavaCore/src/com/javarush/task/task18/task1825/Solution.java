package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<String> set = new TreeSet<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = reader.readLine();
            if (fileName.equals("end"))
                break;
            set.add(fileName);

        }
        String newFile = set.first().substring(0, set.first().lastIndexOf("."));
        File file = new File(newFile);
        for (String tmpFileName : set) {
            FileInputStream fileRead = new FileInputStream(tmpFileName);
            FileOutputStream fileWrite = new FileOutputStream(file, true);
            while (fileRead.available() > 0){
                byte[] buf = new byte[fileRead.available()];
                int count = fileRead.read(buf);
                fileWrite.write(buf, 0, count);

            }
            fileRead.close();
            fileWrite.close();
        }

        reader.close();
    }
}
