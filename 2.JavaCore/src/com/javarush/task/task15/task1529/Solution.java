package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        Solution.reset();
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String resultReader = reader.readLine();

            if (resultReader.equals("helicopter")) {
                result = new Helicopter();
            } else if (resultReader.equals("plane")) {
                int countPass = Integer.parseInt(reader.readLine());
                result = new Plane(countPass);
            } else {
                result = null;
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //add your code here - добавьте код тут
    }
}
