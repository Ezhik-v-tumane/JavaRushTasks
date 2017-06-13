package com.javarush.task.task15.task1521;

import java.math.BigDecimal;

/* 
ООП - перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info((Number)new Integer("4"));
        new Tree().info((Number)new Short("4"));
        new Tree().info((Number)new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info((String)new String("4"));
        new Tree().info((String)new Integer("4").toString());
        new Tree().info((String)new Short("4").toString());
        new Tree().info((String)new BigDecimal("4").toString());
    }
}
