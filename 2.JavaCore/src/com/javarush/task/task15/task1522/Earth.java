package com.javarush.task.task15.task1522;

/**
 * Created by sergeymyskov on 14.06.17.
 */
public class Earth {
    private static Earth ourInstance = new Earth();

    public static Earth getInstance() {
        return ourInstance;
    }

    private Earth() {
    }
}
