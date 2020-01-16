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

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {

        }
        // Random rand = new Random();

        // int randomWithinRange = rand.nextInt((10 - 3) + 1) + 3;
        for (int i = 0; i < 30; i++) {
            int randomWithinRange = rand.nextInt((10 - 3) + 1) + 3;
            System.out.println(randomWithinRange);
        }

    }
}