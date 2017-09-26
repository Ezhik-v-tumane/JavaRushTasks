package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        String key = "Garage611";
        String argument = args[0];
        //String argument = "-d";
        String fileName = args[1];
        //String fileName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1826/2.txt";
        String fileOutputName = args[2];
        //String fileOutputName = "/Users/sergeymyskov/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1826/3.txt";

        switch (argument){
            case "-e": {
                FileInputStream source = new FileInputStream(fileName);
                FileOutputStream destination = new FileOutputStream(fileOutputName);
                while (source.available() > 0){
                    byte[] buf = new byte[source.available()];
                    source.read(buf);

                    encode(buf,key);

                    destination.write(buf);

                    source.close();
                    destination.close();
                    break;
                }
            }
            case "-d": {
                FileInputStream source = new FileInputStream(fileName);
                FileOutputStream destination = new FileOutputStream(fileOutputName);
                while (source.available() > 0){
                    byte[] buf = new byte[source.available()];
                    source.read(buf);

                    decode(buf, key);

                    destination.write(buf);

                    source.close();
                    destination.close();

                    break;

                }

            }
        }

    }
    public static byte[] encode(byte[] buf, String key){
        byte[] bKey = key.getBytes();

        for (int i = 0; i < buf.length; i++){
            buf[i] = (byte) (buf[i] ^ bKey[i % bKey.length]);
        }
        return buf;
    }

    public static String decode(byte[] buf, String key){
        byte[] bKey = key.getBytes();

        for (int i = 0; i < buf.length; i++){
            buf[i] = (byte) (buf[i] ^ bKey[i % bKey.length]);
        }
        return new String(buf);

    }
    */
        String fileName = args[1];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        byte[] result = new byte[0];

        if(args[0].equals("-e"))
            result = encode(buffer);
        else if (args[0].equals("-d"))
            result = decode(buffer);

        String fileOutputName = args[2];
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        fileOutputStream.write(result);
        fileOutputStream.close();
    }

    public static byte[] encode(byte[] content) {
        String pKey = "myKey";
        byte[] key = pKey.getBytes();
        byte[] res = new byte[content.length];

        for (int i = 0; i < content.length; i++) {
            res[i] = (byte) (content[i] ^ key[i % key.length]);
        }

        return res;
    }

    public static byte[] decode(byte[] content) {
        String pKey = "myKey";
        byte[] key = pKey.getBytes();
        byte[] res = new byte[content.length];

        for (int i = 0; i < content.length; i++) {
            res[i] = (byte) (content[i] ^ key[i % key.length]);
        }

        return res;
    }



}
