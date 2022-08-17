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
        int index = -1;
        for (int i = 0; i < groceryItems.size(); i++) {
            GroceryItem item = groceryItems.get(i);
            String itemNameInList = item.getName();
            if(itemNameInList.equalsIgnoreCase(itemName)) {
                // we found it in the list so save its index
                index = i;
            }
        }

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            groceryItems.remove(index);
        }
    }

    public void saveToFile() {
        // 1. make a path object
        Path file = makeFileAndDirectory();

        // 2. make a temporary list of strings that are the grocery items and write those to the file
        List<String> tempItems = new ArrayList<>();
        for(GroceryItem item : groceryItems) {
            tempItems.add(item.toString());
        }

        // 3. use Files.write to send the data to the file
        try {
            Files.write(file, tempItems);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Path makeFileAndDirectory() {
        try {
            Path folder = Paths.get("grocery_list");
            Path file = Paths.get("grocery_list", "data.txt");
            if(Files.exists(folder)) {
                System.out.println("Hey the folder already exists!");
            } else {
                Files.createDirectories(folder);
            }
            if(Files.exists(file)) {
                System.out.println("Hey the file already exists!");
            } else {
                Files.createFile(file);
            }
            return file;
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
