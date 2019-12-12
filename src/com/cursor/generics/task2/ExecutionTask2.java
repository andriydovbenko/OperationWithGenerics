package com.cursor.generics.task2;

public class ExecutionTask2 {

    public static void startProgram() {
        MyListForAnyType<Float> myListForFloat = new MyListForAnyType<>();

        myListForFloat.addValueToList(10f);
        myListForFloat.addValueToList(20.005f);

        MyListForAnyType<String> myListForString = new MyListForAnyType<>();
        myListForString.addValueToList("String");
        myListForString.addValueToList("Hello");

        MyListForAnyType<Integer> myListForInteger = new MyListForAnyType<>();
        myListForInteger.addValueToList(-100);
        myListForInteger.addValueToList(100);

        System.out.println("\nHow we see, this list is flexible and we can put there\n" +
                "all types whose implements interface Comparable");
        myListForFloat.printList();
        myListForInteger.printList();
        myListForString.printList();
    }
}