package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread specialThread1 = new SpecialThread();
        specialThread1.run();
        SpecialThread specialThread2 = new SpecialThread();
        specialThread2.run();
        SpecialThread specialThread3 = new SpecialThread();
        specialThread3.run();
        SpecialThread specialThread4 = new SpecialThread();
        specialThread4.run();
        SpecialThread specialThread5 = new SpecialThread();
        specialThread5.run();

        Thread thread1 = new Thread(specialThread1);
        list.add(thread1);
        Thread thread2 = new Thread(specialThread2);
        list.add(thread2);
        Thread thread3 = new Thread(specialThread3);
        list.add(thread3);
        Thread thread4 = new Thread(specialThread4);
        list.add(thread4);
        Thread thread5 = new Thread(specialThread5);
        list.add(thread5);

        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
