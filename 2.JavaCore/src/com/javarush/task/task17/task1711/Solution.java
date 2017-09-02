package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formDatePrn = new SimpleDateFormat("dd-MMM-yyyy" , Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople){
                for (int i = 0; i < (args.length - 1); i = i + 3){
                        if (args[i + 2].equals("м")){
                            allPeople.add(Person.createMale(args[i + 1], formDate.parse(args[i + 3])));
                            System.out.println(allPeople.size() - 1);
                        }
                        else if (args[i + 2].equals("ж")){
                            allPeople.add(Person.createFemale(args[i + 1], formDate.parse(args[i + 3])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                }
            }
            break;

            case "-u": {
                synchronized (allPeople){
                    for (int i = 0; i < (args.length - 1); i = i + 4){
                        allPeople.get(Integer.parseInt(args[i + 1])).setName(args[i + 2]);
                        if (args[i + 3].equals("м")){
                            allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.MALE);
                        } else if (args[i + 3].equals("ж")){
                            allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[i + 1])).setBirthDay(formDate.parse(args[i + 4]));
                    }
                }

            }
            break;

            case "-d": {
                synchronized (allPeople){
                    for (int i = 0; i < args.length - 1; i++){
                        allPeople.get(Integer.parseInt(args[i + 1])).setName(null);
                        allPeople.get(Integer.parseInt(args[i + 1])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i + 1])).setBirthDay(null);
                    }
                }

            }
            break;

            case "-i": {
                synchronized (allPeople){
                    for (int i = 0; i < args.length - 1; i++){
                        System.out.println(allPeople.get(Integer.parseInt(args[i + 1])).getName() +
                                " " + ((Sex.MALE).equals(allPeople.get(Integer.parseInt(args[i + 1])).getSex()) ? "м": "ж") +
                                " " + formDatePrn.format(allPeople.get(Integer.parseInt(args[i + 1])).getBirthDay()));
                    }
                }
            }
            break;
        }
        //start here - начни тут
    }
}
