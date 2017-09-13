package edu.touro.cs.mco264;

import java.util.*;
import java.util.function.UnaryOperator;

// for this hw reuse your code unless you have a better solution
/**
 * ArrayList of Strings
 */
public class MyArrayList1 implements List<String> {

    private String backingArray[];
    private int insertionPoint, // next elt will be inserted here
            capacity = 10; // current length of backing array

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

    @Override// FIXME
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
        String [] copy = new String[capacity * 2 + 1];
        System.arraycopy(backingArray, 0, copy, 0, capacity);
        backingArray = copy;
        capacity = capacity * 2 + 1;
    }

    @Override// FIXME
    public boolean remove(Object o) {
        return false;
    }

    @Override // FIXME
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override // FIXME
    public boolean addAll(Collection<? extends String> collection) {
        for (String s : collection) {

            this.add(s);
        }
        return true;
    }

    @Override // FIXME
    public boolean addAll(int i, Collection<? extends String> collection) {
        return false;
    }

    @Override // FIXME
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

    @Override // FIXME as per Judah and Ben suggestion
    public void clear() {
        for (int i=0;i<backingArray.length;i++){
            backingArray[i] = null;
        }
        insertionPoint = 0;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size())
        {
            String msg = String.format("index %d is out of bounds Size is %d",index,size());
            throw new IndexOutOfBoundsException(msg);
        }
        return backingArray[index];
    }

    @Override // FIXME
    public String set(int i, String s) {
        return null;
    }

    @Override // FIXME
    public void add(int i, String s) {

    }

    @Override // FIXME
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
