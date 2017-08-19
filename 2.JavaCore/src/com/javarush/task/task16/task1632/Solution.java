package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true);
        }
    }
    public static class Thread2 extends Thread {
        public void run(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static class Thread4 extends Thread implements Message {
        public void showWarning() {
            this.interrupt();
            try {
                this.join();
            }catch (InterruptedException e)
            {

            }
        }

        public void run()
        {
            while (!isInterrupted())
            {

            }
        }
    }
    public static class Thread5 extends Thread {
        String k;
        int keks = 0;
        public void run()
        {
            Scanner scn = new Scanner(System.in);

            while (!(k = scn.nextLine()).equals("N"))
            {
                keks += Integer.parseInt(k);
            }

            System.out.println(keks);
        }
    }
}