package com.cursor.generics.task1;

import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> listOfNumbers = new ArrayList<>();

    public void add(T addNumber) {
        listOfNumbers.add(addNumber);
    }

    public T largest() {
        T largestValue = listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {
            if (largestValue.doubleValue() < listOfNumbers.get(i).doubleValue()) {
                largestValue = listOfNumbers.get(i);
            }
        }
        return largestValue;
    }

    public T smallest() {
        T smallestValue = listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {
            if (smallestValue.doubleValue() > listOfNumbers.get(i).doubleValue()) {
                smallestValue = listOfNumbers.get(i);
            }
        }
        return smallestValue;
    }
}
