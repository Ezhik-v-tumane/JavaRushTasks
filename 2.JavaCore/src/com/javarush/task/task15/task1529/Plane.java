package com.javarush.task.task15.task1529;

/**
 * Created by sergeymyskov on 20.06.17.
 */
public class Plane implements Flyable {
    public int countPass;

    public Plane(int countPass) {
        this.countPass = countPass;
    }

    @Override
    public void fly() {

    }
}