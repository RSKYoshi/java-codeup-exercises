package modified_grocerylist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GroceryListGateway {

    public static void writeToFile(GroceryList groceryList) {
        // 1. make a path object
        Path filePath = getFilePath();
        if(filePath == null) {
            System.out.println("Filepath could not be created. Cannot save.");
            return;
        }

        // 2. make a temporary list of strings that are the grocery items and write those to the file
        List<String> itemStrings = groceryList.toStringList();

        // 3. use Files.write to send the data to the file
        writeItemStringsToFilePath(filePath, itemStrings);
    }


    private static void writeItemStringsToFilePath(Path filePath, List<String> itemStrings) {
        try {
            Files.write(filePath, itemStrings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static GroceryList readFromFile() {
        GroceryList list = new GroceryList();

        // 1. make a path object
        Path filePath = getFilePath();
        if(filePath == null) {
            System.out.println("Filepath could not be created. Cannot load.");
            return list;
        }

        // 2. read item strings from file
        List<String> itemStrings = readItemStringsFromFilePath(filePath);

        // 3. make items from the items strings and put them in the groceryList
        for(String itemString : itemStrings) {
            GroceryItem item = GroceryItem.createFromString(itemString);
            list.addGroceryItem(item);
        }
        return list;
    }

    private static List<String> readItemStringsFromFilePath(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // does everything for the data file and its contain directory
    // and returns the Path object we need to work with the data file
    private static Path getFilePath() {
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
            // log an error message so at least we know something went wrong
            System.err.println(e.getMessage());
        }
        return null;
    }

}

