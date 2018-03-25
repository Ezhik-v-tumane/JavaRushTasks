package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String file = bufferedReader.readLine();
        String file = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/3.JavaMultithreading/src/com/javarush/task/task22/task2209/test.txt";

        String content = new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
        String[] words = content.split(" ");


        StringBuilder result = getLine(words);
        System.out.println(result.toString());

        bufferedReader.close();
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0)
            return result;
        if (words.length==1 || words[0].equals(""))
            return result.append(words[0]);

        ArrayList<String> wordsFromFile = new ArrayList<>();
        wordsFromFile.addAll(Arrays.asList(words));

        while (wordsFromFile.remove("")){
            wordsFromFile.remove("");
        }
        while (isYes(wordsFromFile)) {
            Collections.shuffle(wordsFromFile);
        }
        for (String word: wordsFromFile){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);



        return result;

    }

    public static boolean isYes(ArrayList<String> wordsFromFile) {
        for (int i = 0; i < wordsFromFile.size() - 1; i++) {
            String firstWord = wordsFromFile.get(i).toLowerCase();
            String secondWord = wordsFromFile.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
