package com.cursor.generics.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {
    private List<T> listOfNumbers = new ArrayList<>();

    public void add(T parameter) {
        listOfNumbers.add(parameter);
    }

    public T findLargestValue() {
        return listOfNumbers.isEmpty() ? null : Collections.max(listOfNumbers);
    }

    public T findSmallestValue() {
        return listOfNumbers.isEmpty() ? null : Collections.min(listOfNumbers);
    }
}