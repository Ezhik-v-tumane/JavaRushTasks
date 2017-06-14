package com.javarush.task.task15.task1522;

/**
 * Created by sergeymyskov on 14.06.17.
 */
public class Sun {
    private static Sun instance = new Sun();

    public static Sun getInstance() {
        return instance;
    }

    private Sun() {
    }
}
