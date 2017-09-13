package edu.touro.cs.mco264;

public class Main {

    public static void main(String[] args) {
        MyArrayList1 list = new MyArrayList1();

        for (int i = 0; i < 100; i++)
            list.add(i + " Hooray!");

        for (int i = 0; i < 100; i++)
            System.out.println( list.get(i ));

        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
    }
}
