package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
        Scanner in = new Scanner(new File(file));

        ArrayList<String> wordsFromFile = new ArrayList<>();

        while (in.hasNext()){
            wordsFromFile.add(in.next());
        }
        Collections.sort(wordsFromFile);

        String[] words = wordsFromFile.toArray(new String[wordsFromFile.size()]);


        StringBuilder result = getLine(words);
        System.out.println(result.toString());

        bufferedReader.close();
        in.close();
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>();

        wordsList.addAll(Arrays.asList(words));





        return result;
    }
}
