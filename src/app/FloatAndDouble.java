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

        System.out.println("---------------------------");

        int variableInt = 5 / 3;   // result is 2
        float myVariableFloat = 5f / 3f;
        double variableDouble = 5d / 3d;
        double variableDouble2 = 5.00 / 3.00;   // the same as above 

        // MyFloatValue = 1.6666666
        // MyDoubleValue = 1.6666666666666667

        System.out.println("MyIntValue = " + variableInt);
        System.out.println("MyFloatValue = " + myVariableFloat);
        System.out.println("MyDoubleValue = " + variableDouble);
        System.out.println("MyDoubleValue2 = " + variableDouble2);

        System.out.println("---------------------------");
        
        double numberOfPounds = 130d;
        double poundsInKilograms = 0.45359237d;
        double resultInKilograms = numberOfPounds * poundsInKilograms;

        System.out.println("Converted pounds: " + resultInKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        System.out.println(resultInKilograms);
        

 

    }
}