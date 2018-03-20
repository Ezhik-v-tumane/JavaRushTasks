package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        //String file = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/3.JavaMultithreading/src/com/javarush/task/task22/task2207/test.txt";


        ArrayList<String> allWords = new ArrayList<>();
        ArrayList<StringBuilder> allWordsReverse = new ArrayList<>();
        Set<Pair> set = new HashSet<>();
        Scanner in = new Scanner(new File(file));

        while (in.hasNext()){
            StringBuilder stringBuilder = new StringBuilder(in.next());

            allWords.add(in.next());
            allWordsReverse.add(stringBuilder.reverse());

        }

        for (int i = 0; i < allWords.size(); i++){
            Pair pair = new Pair();
            pair.first = allWords.get(i);
            for (int j = 0; j < allWordsReverse.size(); j++){
                if (pair.first.equals(allWordsReverse.get(j).toString())){
                    pair.second = allWordsReverse.get(j).reverse().toString();
                    set.add(pair);
                    break;
                }
            }

        }

        for (Pair pair: set){
            result.add(pair);
        }

        for (Pair p : result){
            System.out.println(p.toString());
        }


        in.close();
        bufferedReader.close();
    }

    public static class Pair {
        String first;
        String second;

        public Pair(){

        }

        public Pair(String first, String second){
            this.first = first;
            this.second = second;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
