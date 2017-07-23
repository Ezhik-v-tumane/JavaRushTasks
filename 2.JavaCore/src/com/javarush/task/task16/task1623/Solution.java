package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public void run() {
            Thread t = new Thread();
            String name = t.toString();
            //System.out.println(getName().toString());
            System.out.println(name);

        }

        @Override
        public String toString() {

            //return super.toString();
            return getName().toString() + " created";
        }
    }
}
