package com.cursor.generics.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {
    private List<T> listOfNumbers = new ArrayList<>();


}