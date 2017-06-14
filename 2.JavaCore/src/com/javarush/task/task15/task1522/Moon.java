package com.javarush.task.task15.task1522;

/**
 * Created by sergeymyskov on 14.06.17.
 */
public class Moon {
    private static Moon ourInstance = new Moon();

    public static Moon getInstance() {
        return ourInstance;
    }

    private Moon() {
    }
}
