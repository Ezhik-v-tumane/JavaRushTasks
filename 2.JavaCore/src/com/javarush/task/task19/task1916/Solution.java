package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения

Графическое пояснение условия задачи
http://info.javarush.ru/JavaRush_tasks_discussion/2016/02/14/level19-lesson10-bonus01-%D0%93%D1%80%D0%B0%D1%84%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5-%D0%BF%D0%BE%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D1%83%D1%81%D0%BB%D0%BE%D0%B2%D0%B8%D1%8F-%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B8-.html
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<String> list1 = new ArrayList<>();
    public static List<String> list2 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/1.txt";
        String fileName2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/2.txt";
        //String fileName1 = reader.readLine();
        //String fileName2 = reader.readLine();

        reader.close();

        BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader file2 = new BufferedReader(new FileReader(fileName2));

        while (file1.ready()){
            list1.add(file1.readLine());
        }
        file1.close();

        while (file2.ready()){
            list2.add(file2.readLine());
        }
        file2.close();

        String line1, line2;



        for (int i = 0, j = 0; i < list2.size(); i++, j++){
             line1 = list1.get(i);
             line2 = list2.get(j);
             if (line1.equals(line2)){
                 lines.add(new LineItem(Type.SAME, list1.get(i)));
                 System.out.println(j);
             }
             if (!line1.equals(line2) & line1.equals(list2.get(j + 1))){
                 lines.add(new LineItem(Type.ADDED, list2.get(j + 1)));
                 list1.add(i, list2.get(j + 1));
             }

        }


        //проверка

        for (int i = 0; i < lines.size(); i++){
            System.out.println(lines.get(i).type + " " + lines.get(i).line);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
