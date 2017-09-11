package edu.touro.cs.mco264;

public class Main {

    public static void main(String[] args) {
        MyArrayList1 list = new MyArrayList1();

        list.add("Nachi");
        list.add("Dovie");
        System.out.println( list.size());

        list.clear();
        System.out.println( list.size());
    }
}
