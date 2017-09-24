package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1823/1.txt";

        while (true){
            String fileName = reader.readLine();
            if (fileName.equals("exit"))
                break;
            ReadThread thread = new ReadThread(fileName);
            thread.start();

        }



    }

    public static class ReadThread extends Thread {
        private String fileName;
        private byte findedByte;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }
        public void run(){
            HashMap<Byte, Integer> tmpMap = new HashMap<Byte, Integer>();

            try {
                FileInputStream f = new FileInputStream(this.fileName);
                while (f.available() > 0){
                    byte[] buf = new byte[f.available()];
                    f.read(buf);

                    for (byte b : buf){
                        if (tmpMap.containsKey(b))
                            tmpMap.put(b, tmpMap.get(b) + 1);
                        else
                            tmpMap.put(b, 1);
                    }

                }
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int max = 0;
            for (Map.Entry<Byte, Integer> pair : tmpMap.entrySet()) {
                if (max < pair.getValue()) {
                    this.findedByte = pair.getKey();
                    max = pair.getValue();
                }
            }

            synchronized (resultMap) {
                resultMap.put(this.fileName, new Integer(this.findedByte));
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
