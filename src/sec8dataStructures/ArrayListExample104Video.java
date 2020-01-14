package sec8dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample104Video {
    
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
     
    private static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                printInstructions();
                break;

                case 1:
                groceryList.printGroceryList();
                break;

                case 2:
                addItem();
                break;

                case 3:
                modifyItem();
                break;

                case 4:
                removeItem();
                break;

                case 5:
                searchForItem();
                break;

                case 6:
                quit = true;
                break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item to the list.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search the application.");
        System.out.println("\n 6 - To quit the application.");

    }
}