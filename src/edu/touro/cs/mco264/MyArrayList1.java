package edu.touro.cs.mco264;

import java.util.*;
import java.util.function.UnaryOperator;

// for this hw reuse your code unless you have a better solution
/**
 * ArrayList of Ts
 */
public class MyArrayList1<T> implements List<T> {

    private T[] backingArray;
    private int insertionPoint, // next elt will be inserted here
            capacity = 10; // current length of backing array

    public MyArrayList1(){
        backingArray = (T[]) new Object[capacity];
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
        for(T s: this)
        {
            if (s.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayList1Iterator();
    }

    // non-static inner class has access to outer class fields and methods
    class ArrayList1Iterator implements Iterator<T>
    {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return this.index < MyArrayList1.this.size();
        }
        @Override
        public T next() {
            return backingArray[index++];
        }
    }

    @Override// FIXME
    public Object[] toArray() {
        return new Object[0];
    }

    @Override// FIXME
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(T s) {

        if (insertionPoint >= capacity) // must grow array
        {
            growArray();
        }
        backingArray[insertionPoint++] = s;

        return true;
    }

    private void growArray() {
        T [] copy = (T [])new Object[capacity * 2 + 1];
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

    @Override // FIXME and optimize
    public boolean addAll(Collection<? extends T> collection) {
        // optimize by growing capacity to required size _before_ adding elts from collection
        for (T s : collection) {
            this.add(s);
        }
        return true;
    }

    @Override // FIXME and optimize to have only one shift
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override // FIXME
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override // FIXME
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> unaryOperator) {

    }

    @Override
    public void sort(Comparator<? super T> comparator) {

    }

    @Override // FIXME as per Judah and Ben suggestion
    public void clear() {
        for (int i=0;i<backingArray.length;i++){
            backingArray[i] = null;
        }
        insertionPoint = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size())
        {
            String msg = String.format("index %d is out of bounds Size is %d",index,size());
            throw new IndexOutOfBoundsException(msg);
        }
        return backingArray[index];
    }

    @Override // FIXME
    public T set(int i, T s) {
        return null;
    }

    @Override // FIXME
    public void add(int i, T s) {

    }

    @Override // FIXME
    public T remove(int i) {
        return null;
    }

    @Override // FIXME
    public int indexOf(Object o) {
        return 0;
    }

    @Override// FIXME
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
