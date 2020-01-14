package sec8dataStructures;

import java.util.ArrayList;

public class GroceryList { 
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();
    
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
}