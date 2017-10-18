package edu.touro.cs.mco264;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayList1Test {

    @Test
    public void isEmptyWhenNew() {
        //AAA
        // Arrange
        MyArrayList1 list = new MyArrayList1();

        // Act
        boolean actual = list.isEmpty();

        // Assert
        org.junit.Assert.assertTrue(actual);
    }

    @Test
    public void isEmptyWhenOneEltAdded() {
        //AAA
        // Arrange
        MyArrayList1 list = new MyArrayList1();
        list.add("");

        // Act
        boolean actual = list.isEmpty();

        // Assert
        assertTrue(! actual);
    }

    @Test
    public void sizeWhenOneEltAdded() {
        // AAA
        // Arrange
        MyArrayList1 list = new MyArrayList1();
        list.add("");

        // Act
        int actua = list.

        // Assert
        assertEquals(1, actua);
    }


    @Test
    public void containsWhenContainsItemShouldBeTrue() {
        // AAA
        // Arrange
        MyArrayList1 list = new MyArrayList1();
        String aString = "A";
        list.add(aString);


        String aString2 = new String("A");
        // Act
        boolean actual = list.contains(aString2);

        // Assert
        assertTrue(actual);
    }


    @Test
    public void addAll1() {
        // AAA
        // Arrange
        MyArrayList1 list = new MyArrayList1();

        java.util.ArrayList<String> coll = new java.util.ArrayList<>();
        coll.add("a");coll.add("b");

        // Act
        list.addAll(coll);

        // Assert
        assertEquals(2,list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }
}