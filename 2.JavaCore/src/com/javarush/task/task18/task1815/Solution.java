package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {

        ATableInterface original;


        public TableInterfaceWrapper(ATableInterface atf){
            this.original = atf;

        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.original.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return this.original.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.original.setHeaderText(newHeaderText);

        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}