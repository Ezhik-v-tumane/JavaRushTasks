package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game = null;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move() {
        for (Horse horse : horses){
            horse.move();
        }
    }
    void print() {
        for (Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        double tmpMax = 0;
        Horse tmpHorse = null;
        for (Horse horse : horses){
            if (tmpMax < horse.getDistance()){
                tmpMax = horse.getDistance();
                tmpHorse = horse;
            }
        }
        return tmpHorse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }




    public static void main(String args[]) throws InterruptedException {

        List<Horse> horses = new Hippodrome(new ArrayList<>()).getHorses();

        horses.add(new Horse("horse1", 3.0, 0.0));
        horses.add(new Horse("horse2", 3.0, 0.0));
        horses.add(new Horse("horse3", 3.0, 0.0));

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();

    }
}
