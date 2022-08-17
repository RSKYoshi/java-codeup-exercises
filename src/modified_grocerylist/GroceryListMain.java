package modified_grocerylist;
import java.util.ArrayList;

public class GroceryListMain {

    public static void main(String[] args) {
//        GroceryItem [] groceryList = new GroceryItem[10];
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        GroceryList groceryList = new GroceryList();

        GroceryItem naranjas = new GroceryItem("Oranges", 5);
        GroceryItem beer = new GroceryItem("Dos Equis", 24);
        GroceryItem tocino = new GroceryItem("Bacon", 10);
        GroceryItem wine = new GroceryItem("Wine", 1);



        // add the items to the list
        groceryList.addGroceryItem(naranjas);
        groceryList.addGroceryItem(tocino);
        groceryList.addGroceryItem(beer);
        groceryList.addGroceryItem(wine);


        groceryList.printItems();

        groceryList.removeGroceryItem("Bacon");
        groceryList.printItems();

        groceryList.saveToFile();

    }
}
