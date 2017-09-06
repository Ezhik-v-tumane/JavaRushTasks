package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = null;
        String file2 = null;

        //Имена файлов.
        //String file1 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task17/task1721/1.txt";
        //String file2 = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task17/task1721/2.txt";

        try {
            //file1 = reader.readLine();
            //file2 = reader.readLine();
            BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            //BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            //BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            String line;
            while ((line = fileReader1.readLine()) != null) {
                allLines.add(line);
            }
            while ((line = fileReader2.readLine()) != null) {
                forRemoveLines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //проверка имен файлов.
        //System.out.println(file1);
        //System.out.println(file2);

        Solution solution = new Solution();
        solution.joinData();

        /*for (int i = 0; i < allLines.size(); i++){
            System.out.println(allLines.get(i));
        }*/
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
