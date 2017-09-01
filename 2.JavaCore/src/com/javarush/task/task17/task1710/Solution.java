package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formDatePrn = new SimpleDateFormat("dd-MMM-yyyy" , Locale.ENGLISH);

        if (args[0].equals("-c")) {
            if (args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], formDate.parse(args[3])));
                //System.out.println(allPeople.indexOf(Person.createMale(args[1], formDate.parse(args[3]))));
                System.out.println(allPeople.size() - 1);
            }
            else if (args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1], formDate.parse(args[3])));
                //System.out.println(allPeople.indexOf(Person.createFemale(args[1], formDate.parse(args[3]))));
                System.out.println(allPeople.size() - 1);
            }

        } else if (args[0].equals("-u")){
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            if (args[3].equals("м")){
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else if (args[3].equals("ж")){
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(formDate.parse(args[4]));

        } else if (args[0].equals("-d")){
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);

        } else if (args[0].equals("-i")){
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() +
                    " " + ((Sex.MALE).equals(allPeople.get(Integer.parseInt(args[1])).getSex()) ? "м": "ж") +
                    " " + formDatePrn.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
        }

        //start here - начни тут
    }
}
