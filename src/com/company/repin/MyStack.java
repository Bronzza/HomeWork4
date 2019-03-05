package com.company.repin;

public class MyStack<T> extends MyLinkedList {

    public T push(T element) {
        addFirst(element);
        return (T) get(0);
    }

    public T pop() {
        T value = (T) get(0);
        remove(0);
        return value;
    }

    public T peek() {
        return (T) get(0);
    }

}
