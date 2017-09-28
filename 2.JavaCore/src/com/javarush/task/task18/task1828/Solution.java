package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String argument = args[0];
        String id = args[1];
        String productName = args[2];
        String price = args[3];
        String quantity = args[4];

        if (id.length() > 8)
            id = id.substring(0, 8);
        if (productName.length() > 30)
            productName = productName.substring(0,30);
        if (price.length() > 8)
            price = price.substring(0, 8);
        if (quantity.length() > 4)
            quantity = quantity.substring(0, 4);

        ArrayList<String> arrStr = new ArrayList<>();

        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));



        while (readerFile.ready())
            arrStr.add(readerFile.readLine());
        readerFile.close();

        switch (argument){
            case ("-u"):{
                String strForSet = String.format("%-8s", id) + String.format("%-30s",productName) + String.format("%-8s", price) + String.format("%-4s",quantity);
                for (int i = 0; i < arrStr.size(); i++){
                    if (arrStr.get(i).startsWith(id))
                        arrStr.set(i, strForSet);
                }
                fileWrite(arrStr, fileName);
                break;
            }
            case ("-d"):{

                for (String s : arrStr){
                    if (s.startsWith(id))
                        arrStr.remove(s);
                }
                fileWrite(arrStr, fileName);

                break;

            }
        }

    }
    public static void fileWrite(ArrayList<String> arrStr, String fileName) throws IOException {
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        for (String s: arrStr)
            buf.write(s+"\r\n");
        buf.close();

    }
}
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> products = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (fileReader.ready())
            products.add(fileReader.readLine());
        fileReader.close();

        switch (args[0]) {
            case "-u": {
                if (args.length < 5)
                    return;

                float price;
                int qty;
                int idFromCommand = 0;

                //Если что-то передали не то
                try {
                    price = Float.parseFloat(args[args.length - 2]);
                    qty = Integer.parseInt(args[args.length - 1]);
                    idFromCommand = Integer.parseInt(args[1]);
                } catch (NumberFormatException e) {
                    return;
                }

                //Если у нас аргументов больше 4, из-за пробелов в строке productName
                String productName;
                if (args.length > 5) {
                    StringBuffer buf = new StringBuffer();
                    for (int i = 2; i < args.length - 2; i++)
                        buf.append(args[i]).append(" ");
                    productName = buf.substring(0, buf.length() - 1);
                } else
                    productName = args[2];

                //Get ID from line and update

                Pattern p = Pattern.compile("([0-9]{1,8})");
                for (int i = 0; i < products.size(); i++) {
                    String s = products.get(i);
                    Matcher m = p.matcher(s);
                    if (m.lookingAt()) {
                        try {
                            int id = Integer.parseInt(s.substring(m.start(), m.end()));
                            if (id == idFromCommand) {
                                products.set(i, String.format(Locale.ROOT, "%-8d%-30s%-8.2f%-4d", id, productName, price, qty));
                                break;
                            }
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                }
                break;
            }

            case "-d": {
                Iterator<String> iter = products.iterator();
                while (iter.hasNext()) {
                    String product = iter.next();
                    if (product.startsWith(args[1]))
                        iter.remove();
                }
                break;
            }
        }

        PrintWriter fileWriter = new PrintWriter(fileName);
        for (String s : products)
            fileWriter.println(s);
        fileWriter.close();
    }
}
