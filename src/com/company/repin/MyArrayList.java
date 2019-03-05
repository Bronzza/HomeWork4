package com.company.repin;


public class MyArrayList<T> implements MyList<T> {
    private Object[] array;
    private int counter = 0;

    public MyArrayList() {
        array = new Object[0];
    }


    @Override
    public T get(int i) {
        for (int j = 0; j < array.length; j++) {
            if (j == i) {
                return (T) array[j];
            }
        }
        return null;
    }

    @Override
    public void add(T t) {
        if (array.length == 0) {
            array = new Object[10];
        }
        array[counter] = t;
        counter++;
        if (counter == array.length) {
            expandArray(array);
        }
    }


    public void add(int index, T t) {
        if (index < 0 || index > counter) {
            System.out.println("Enter positive number below " + (counter - 1));
            return;
        }
        if (index == counter) {
            array[index] = t;
            counter++;
        } else {
            Object[] temp = new Object[array.length];
            System.arraycopy(array, 0, temp, 0, index);
            temp[index] = t;
            System.arraycopy(array, index, temp, index + 1, counter - index);
            array = temp;
            counter++;
        }
        if (counter == array.length) {
            expandArray(array);
        }
    }

    @Override
    public void remove(int index) {
        if (index > counter - 1 || index < 0) {
            System.out.println("Enter positive number below " + (counter - 1));
            return;
        }
        if (index == counter - 1) {
            array[index] = null;
            counter--;
        } else {
            array[index] = null;
            System.arraycopy(array, index + 1, array, index, counter - index - 1);
            counter--;
        }
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < counter; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i != counter - 1) {
                sb.append(array[i] + ",");
            } else {
                sb.append(array[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void expandArray(Object[] arrayToExpand) {
        Object[] temp = new Object[(int) (arrayToExpand.length * 1.5)];
        System.arraycopy(arrayToExpand, 0, temp, 0, arrayToExpand.length);
        arrayToExpand = temp;
    }

}
