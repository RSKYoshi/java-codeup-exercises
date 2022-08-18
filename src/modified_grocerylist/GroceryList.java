package modified_grocerylist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private ArrayList<GroceryItem> groceryItems;
//    private GroceryItem [] groceryItems;

    public GroceryList() {
        groceryItems = new ArrayList<>();
//        groceryItems = new GroceryItem[10];
    }

    public void addGroceryItem(GroceryItem item) {
        // array specific
//        groceryItems[0] = item;
        groceryItems.add(item);
    }

    public void printItems() {
        System.out.println("My Grocery List");
        for(GroceryItem item : groceryItems) {
            System.out.println("\t" + item);
        }
    }

    public void removeGroceryItem(String itemName) {
        // 1. find the index of the grocery item with itemName
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            groceryItems.remove(index);
        }
    }

    private int getIndexOfItemByName(String itemName) {
        int index = -1;
        for (int i = 0; i < groceryItems.size(); i++) {
            GroceryItem item = groceryItems.get(i);
            String itemNameInList = item.getName();
            if(itemNameInList.equalsIgnoreCase(itemName)) {
                // we found it in the list so save its index
                return i;
            }
        }
        return index;
    }

    public void setItemQuantity(String itemName, int quantity) {
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            GroceryItem item = groceryItems.get(index);
            item.setQuantity(quantity);
        }
    }

    public GroceryItem getItemByName(String itemName) {
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            return groceryItems.get(index);
        }
        System.out.println("Could not find item: " + itemName);
        return null;
    }

    public List<String> toStringList() {
        List<String> itemStrings = new ArrayList<>();
        for(GroceryItem item : groceryItems) {
            itemStrings.add(item.toString());
        }
        return itemStrings;
    }

}
