package com.cursor.generics.task1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    private List<T> listOfNumbers = new ArrayList<>();

    public void add(T parameter) {
        listOfNumbers.add(parameter);
    }

    public T largest() {
        T largestValue = null;
        if (listOfNumbers.size() > 0) {
            largestValue = listOfNumbers.get(0);
            for (int i = 1; i < listOfNumbers.size(); i++) {
                if (largestValue.doubleValue() < listOfNumbers.get(i).doubleValue()) {
                    largestValue = listOfNumbers.get(i);
                }
            }
        }
        return largestValue;
    }

    public T smallest() {
        T smallestValue = null;
        if (listOfNumbers.size() > 0) {
            smallestValue = listOfNumbers.get(0);
            for (int i = 1; i < listOfNumbers.size(); i++) {
                if (smallestValue.doubleValue() > listOfNumbers.get(i).doubleValue()) {
                    smallestValue = listOfNumbers.get(i);
                }
            }
        }
        return smallestValue;
    }
}