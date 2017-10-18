package edu.touro.cs.mco264;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String s = "bob";

        MyArrayList1 list = new MyArrayList1();

//        for (int i = 0; i < 100; i++)
//            list.add(i + " Hooray!");

//        for (int i = 0; i < 100; i++)
//            System.out.println( list.get(i ));
//
//        System.out.println(list.size());
//
//        list.clear();
//        System.out.println(list.size());
        list.add("Bob");
        list.add("Albert");
        for (String s: list){
            System.out.println(s);
        }

//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }




//        ArrayList<String> realArrayList = new ArrayList<>();
//        realArrayList.add("Bob");
//        realArrayList.add("Albert");
//        for (String s: realArrayList){
//            s = "Hocker";
//            System.out.println(s);
//        }
//
//        iterator = realArrayList.iterator();
//
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }
    }
}
