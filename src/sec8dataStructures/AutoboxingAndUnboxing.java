package sec8dataStructures;

import java.util.ArrayList;
import java.util.Random;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingAndUnboxing {
    private static Random rand = new Random();

    public static void main(String[] args) {
        // RANDOM WITHIN RANGE!!!!!! coOOOL:
        // int randomWithinRange = rand.nextInt((10 - 3) + 1) + 3;
        // for (int i = 0; i < 30; i++) {
        // int randomWithinRange = rand.nextInt((10 - 3) + 1) + 3;
        // System.out.println(randomWithinRange);
        // }


        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // cannot be primite, it will cause an error!
        // ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        System.out.println(intClassArrayList.get(0));
        // output just a reference

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        // AUTOBOXING
        // - converting base primitve type int to an Integer
        // 1) we take the primitive type and we are going to the
        // object wrapper.
        // 
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        // UNBOXING
        // reverse autoboxing
        // 1) we are taking it from the class or from the object wrapper
        // 2) and converting it back to the primitive type
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ------> " + intArrayList.get(i).intValue());
        }
        
        Integer myIntValue = 56; // ==> Integer.valueOf(56);    
        int myInt = myIntValue; // ==> myInt.intValue();

System.out.println("---------------");

        //AUTOBIXING! double to ArrayList<Double>
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
            // same thing:
            // myDoubleValues.add(dbl);
        }

        // UNBOXING! ArrayList<Double> to double
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            // same thing:
            // double value = myDoubleValues.get(i);
            System.out.println(i + " -----> " + value);
        }

    }
}