package modified_grocerylist;
import java.util.ArrayList;

public class GroceryListMain {

    public static void main(String[] args) {
//        GroceryItem [] groceryList = new GroceryItem[10];
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        GroceryList groceryList = new GroceryList();

        GroceryItem naranjas = new GroceryItem("Oranges", 5);
        GroceryItem cervezas = new GroceryItem("Dos Equis", 24);
        GroceryItem tocino = new GroceryItem("Bacon", 10);

        // add the items to the list
        groceryList.addGroceryItem(naranjas);
        groceryList.addGroceryItem(tocino);
        groceryList.addGroceryItem(cervezas);

//        groceryList.printItems();

        groceryList.removeGroceryItem("Bacon");
//        groceryList.printItems();

        groceryList.setItemQuantity("Oranges", 12);
        GroceryItem anItem = groceryList.getItemByName("Oranges");
        System.out.println(anItem);

        anItem = groceryList.getItemByName("Tangerines");

        GroceryListGateway.writeToFile(groceryList);

        GroceryList list2 = GroceryListGateway.readFromFile();
        System.out.println("list2's contents");
        list2.printItems();

        System.out.println(list2.toStringList());

    }
}
