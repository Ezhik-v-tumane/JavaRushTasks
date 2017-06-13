package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> crMap = new HashMap<String, Integer>();
        crMap.put("Иванов01", 400);
        crMap.put("Иванов02", 400);
        crMap.put("Иванов03", 400);
        crMap.put("Иванов04", 400);
        crMap.put("Иванов05", 501);
        crMap.put("Иванов06", 501);
        crMap.put("Иванов07", 501);
        crMap.put("Иванов08", 501);
        crMap.put("Иванов09", 400);
        crMap.put("Иванов10", 500);
        return crMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        for(Iterator<HashMap.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            HashMap.Entry<String, Integer> entry = it.next();
            if(entry.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}