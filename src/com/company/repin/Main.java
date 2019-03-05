package com.company.repin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> firstList = new MyLinkedList<String>();
        firstList.add("Vasya");
        firstList.add("Petya");
        System.out.println(firstList);
        firstList.add("Galya");
        System.out.println(firstList);
        System.out.println(firstList.size());
    }

}
