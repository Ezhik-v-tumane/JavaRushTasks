package com.javarush.task.task14.task1413;

/**
 * Created by sergeymyskov on 09.03.17.
 */
public class Monitor implements CompItem {
    public String getName() {
        return Monitor.class.getSimpleName();
        //return this.getClass().getName();
    }
}
