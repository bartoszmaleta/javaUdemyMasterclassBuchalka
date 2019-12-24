package app;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        System.out.println("---------------------------");

        int myIntValue = 5;
        float myFloatValue = 5.25f;    // "5f" ----> good practice
        // float myFloatValue = 5.25;  // without "f" we will get an error, require a double
        double myDoubleValue = 5.25d;  // "5d" ----> good practice

        System.out.println("---------------------------");
        
        // float variableFloat = 6.32;     // error to repair ---> CHALLENGE
        float variableFloat = (float) 6.32; // not recommended
        float variableFloatWithF = 6.32f; // recommended


    }
}