package com.cursor.generics.task1;

public class Generics {

    public static void findLargestSmallest() {
        float[] arrayOfFloat = {20, 11.0f, 0f, -1f, 60.055f, 18f, 88.440f, 11.05f};
        MyList<Float> listOfFloat = new MyList<>();
        for (Float digit : arrayOfFloat) {
            listOfFloat.add(digit);
        }
        System.out.println("The largest digit of list is: " + listOfFloat.largest() +
                "\nThe smallest digit of list is: " + listOfFloat.smallest());
    }
}
