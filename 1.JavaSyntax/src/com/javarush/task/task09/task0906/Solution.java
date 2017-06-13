package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код

        {
            Throwable t = new Throwable();
            StackTraceElement trace[] = t.getStackTrace();

            if (trace.length > 1)
            {
                StackTraceElement element = trace[1];
                System.out.format("%s: %s: %s", element.getClassName(), element.getMethodName(), s);
            }
            else
                System.out.format("no info: %s", s);
        }
    }
}
