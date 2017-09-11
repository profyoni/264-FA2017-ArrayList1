package edu.touro.cs.mco264;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * ArrayList of Strings
 */
public class MyArrayList1 implements List<String> {

    private String backingArray[];
    private int insertionPoint, capacity = 10;

    public MyArrayList1(){
        backingArray = new String[capacity];
    }

    @Override
    public int size() {
        return insertionPoint;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(String s) {

        if (insertionPoint >= capacity) // must grow array
        {
            growArray();
        }
        backingArray[insertionPoint++] = s;

        return true;
    }

    private void growArray() {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends String> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<String> unaryOperator) {

    }

    @Override
    public void sort(Comparator<? super String> comparator) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int i) {
        return null;
    }

    @Override
    public String set(int i, String s) {
        return null;
    }

    @Override
    public void add(int i, String s) {

    }

    @Override
    public String remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int i) {
        return null;
    }

    @Override
    public List<String> subList(int i, int i1) {
        return null;
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
