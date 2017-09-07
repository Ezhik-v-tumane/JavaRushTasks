package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            FileInputStream file = new FileInputStream(filename);
            int size = file.available();
            file.close();
            reader.close();

            if (size < 1000)
                throw new DownloadException();
        }

    }

    public static class DownloadException extends Exception {

    }
}
