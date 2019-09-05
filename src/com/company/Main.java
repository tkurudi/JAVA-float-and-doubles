package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value " + myMinFloatValue  );
        System.out.println("float max value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value " + myMinDoubleValue  );
        System.out.println("double max value " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5 / 3d;

        System.out.println("my Double value = " + myDoubleValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my Int Value = " + myIntValue);

    }
}
