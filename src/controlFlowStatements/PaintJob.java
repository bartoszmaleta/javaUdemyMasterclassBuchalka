package controlFlowStatements;

import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        int neededBuckets = getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println(neededBuckets);
        System.out.println("--------------------");

        int neededBuckets2 = getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(neededBuckets2);
        System.out.println("--------------------");

        int neededBuckets3 = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(neededBuckets3);
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        int neededBuckets4 = getBucketCount(-3.4, 2.1, 1.5);
        System.out.println(neededBuckets4);
        System.out.println("--------------------");

        int neededBuckets5 = getBucketCount(3.4, 2.1, 1.5);
        System.out.println(neededBuckets5);
        System.out.println("--------------------");

        int neededBuckets6 = getBucketCount(7.25, 4.3, 2.35);
        System.out.println(neededBuckets6);
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        int neededBuckets7 = getBucketCount(3.4, 1.5);
        System.out.println(neededBuckets7);
        System.out.println("--------------------");

        int neededBuckets8 = getBucketCount(6.26, 2.2);
        System.out.println(neededBuckets8);
        System.out.println("--------------------");

        int neededBuckets9 = getBucketCount(3.26, 0.75);
        System.out.println(neededBuckets9);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int exraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || exraBuckets < 0) {
            return -1;
        }

        double areaOfWall = width * height;
        // System.out.println(areaOfWall);

        // System.out.println(areaPerBucket);

        double numberOfBucketsNeeded = areaOfWall / areaPerBucket;
        // System.out.println(numberOfBucketsNeeded);

        double roundedNumberOfBucketsNeeded = Math.ceil(numberOfBucketsNeeded);
        // System.out.println(roundedNumberOfBucketsNeeded);

        int intRoundedNumberOfBucketsNeeded = (int) roundedNumberOfBucketsNeeded - exraBuckets;
        // System.out.println(intRoundedNumberOfBucketsNeeded);

        return intRoundedNumberOfBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaOfWall = width * height;
        // System.out.println(areaOfWall);

        // System.out.println(areaPerBucket);

        double numberOfBucketsNeeded = areaOfWall / areaPerBucket;
        // System.out.println(numberOfBucketsNeeded);

        double roundedNumberOfBucketsNeeded = Math.ceil(numberOfBucketsNeeded);
        // System.out.println(roundedNumberOfBucketsNeeded);

        int intRoundedNumberOfBucketsNeeded = (int) roundedNumberOfBucketsNeeded;
        // System.out.println(intRoundedNumberOfBucketsNeeded);

        return intRoundedNumberOfBucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket<= 0) {
            return -1;
        }
        // System.out.println(area);

        // System.out.println(areaPerBucket);

        double numberOfBucketsNeeded = area / areaPerBucket;
        // System.out.println(numberOfBucketsNeeded);

        double roundedNumberOfBucketsNeeded = Math.ceil(numberOfBucketsNeeded);
        // System.out.println(roundedNumberOfBucketsNeeded);

        int intRoundedNumberOfBucketsNeeded = (int) roundedNumberOfBucketsNeeded;
        // System.out.println(intRoundedNumberOfBucketsNeeded);

        return intRoundedNumberOfBucketsNeeded;
    }
}