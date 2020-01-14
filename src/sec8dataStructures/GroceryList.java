package sec8dataStructures;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery List");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // new
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem );
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // new
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
            System.out.println("Grocery item " + (position + 1) + " has been removed");
        } else {
            System.out.println("Did not find the item");
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // public String findItem(String searchItem) {
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);

        // boolean exists = groceryList.contains(searchItem);

        // int position = groceryList.indexOf(searchItem);
        // if (position >= 0) {
        // return groceryList.get(position);
        // }
        // return null;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}