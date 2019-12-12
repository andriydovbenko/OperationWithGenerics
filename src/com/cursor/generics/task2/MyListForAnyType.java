package com.cursor.generics.task2;

import java.util.ArrayList;
import java.util.List;

public class MyListForAnyType<T extends Comparable<T>> {

    private List<T> listForAllTypesImplementingComparable = new ArrayList<>();

    public void addValueToList(T parameter) {
        listForAllTypesImplementingComparable.add(parameter);
    }

    public void printList() {
        if (listForAllTypesImplementingComparable.size() > 0) {
            System.out.println("Type of list: " +
                    listForAllTypesImplementingComparable.get(0).getClass().getSimpleName());
            for (int i = 0; i < listForAllTypesImplementingComparable.size(); i++) {
                System.out.println("Element if list № " + i + " : " +
                        listForAllTypesImplementingComparable.get(i) + "\n");
            }
        }else {
            System.out.println("\nI am empty, please fill up me (*_*) ");
        }
    }
}