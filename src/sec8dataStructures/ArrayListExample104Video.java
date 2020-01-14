package sec8dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample104Video {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

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
                processArrayList();
                break;

            case 7:
                quit = true;
                break;
            }
        }
    }

    public static void printInstructions() {
        System.out.print("\n Press ");
        System.out.print("\n 0 - To print choice options.");
        System.out.print("\n 1 - To print the list of grocery items.");
        System.out.print("\n 2 - To add an item to the list.");
        System.out.print("\n 3 - To modify an item in the list.");
        System.out.print("\n 4 - To remove an item from the list.");
        System.out.print("\n 5 - To search the application.");
        System.out.print("\n 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        // OPTION ONE TO COPY LIST:
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // OPTION TWO TO COPY LIST:
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
    }
}