package com.cursor.generics.task1;

import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> listOfNumbers = new ArrayList<>();
    public void add(T parameter) {
        listOfNumbers.add(parameter);
    }

    public T largest() {
        if (listOfNumbers.size() > 0) {
            T largestValue = listOfNumbers.get(0);
            for (int i = 1; i < listOfNumbers.size(); i++) {
                if (largestValue.doubleValue() < listOfNumbers.get(i).doubleValue()) {
                    largestValue = listOfNumbers.get(i);
                }
            }
            return largestValue;
        }
        return null;
    }

    public T smallest() {
        if (listOfNumbers.size() > 0) {
            T smallestValue = listOfNumbers.get(0);
            for (int i = 1; i < listOfNumbers.size(); i++) {
                if (smallestValue.doubleValue() > listOfNumbers.get(i).doubleValue()) {
                    smallestValue = listOfNumbers.get(i);
                }
            }
            return smallestValue;
        }
        return null;
    }
}