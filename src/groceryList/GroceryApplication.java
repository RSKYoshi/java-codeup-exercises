package groceryList;
import util.Input;
import java.util.ArrayList;
import java.util.Collections;

//public class GroceryApplication {
//    public static void main(String[] args) {
//        Input input = new Input();
////        A user should be prompted if they would like to create a grocery list.
////
////        If they pick yes, they will be prompted if they would like to enter a new item.
////
////                If the users picks yes, they should be given the following three prompts:
////
////        Given an ordered list of grocery categories to choose from, select the category.
////        Enter the name of the item.
////        Enter how many of the item.
////        The user will then be given the choice to finalize the list or add an item.
////
////        Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by a category, and including quantity.
////
////        As a bonus, allow users to filter the results by only one category of items at a time.
////
////        For a super gold star bonus, allow users to edit the list items.
//        System.out.println("Would you like to create a grocery list?");
//        if(!input.yesNo()){
//            System.out.println("Goodbye");
//        }
//        //prompt user here to keep inputting items until done
//        ArrayList<GroceryItem> groceries = getItemsFromUser();
//        System.out.println("Goodbye");
//
//
//        public static void getItemsFromUser(){
//            while(true){
//                printGroceryCategories();
//
//                int categoryNum = input.getInt(1,100);
//                System.out.println("Enter number of the category");
//
//                System.out.println("Enter then name of the item");
//
//                System.out.println("Would you like to add another item?");
//                if(!input.yesNo()){
//                    return;
//                }
//            }
//        }
//
//
//        //in main
//    }
//    //out of main
//
//
//}

//copy here


public class GroceryApplication {
    public static final int PRODUCE = 1;
    public static final int MEATS = 2;

    private static Input input = new Input();

    public static void main(String[] args) {
        // A user should be prompted if they would like to create a grocery list.
//        if(input.yesNo("Would you like to create a grocery list? (y/n) ") == false) {
//            System.out.println("Bye");
//            return;
//        }
        System.out.println("Would you like to create a grocery list?");
        if(!input.yesNo()){
            System.out.println("Goodbye");
            return;
        }

        // ask user to keep inputting items until they are done
        ArrayList<GroceryItem> groceries = getGroceryListFromUser();

        // if we got here, then user is done inputting items
        printGroceryList(groceries);

        System.out.println("Done");
    }

    private static ArrayList<GroceryItem> getGroceryListFromUser() {
        ArrayList<GroceryItem> groceries = new ArrayList<>();

        // keep asking user to input items until he/she says done
        while(true) {
            printGroceryCategories();


//            System.out.println("Enter the number of the category: ");
            int categoryNum = input.getIntRange(1,2,"Enter the number of the category: " );



            System.out.print("Enter the name of the item: ");
            String itemName = input.getString();

            System.out.println("Enter the quantity of the item: ");
            int itemQty = input.getInt();

            // now that we have the 3 pieces of info for item, make the item
            GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
            groceries.add(item);

//            if(input.yesNo("Would you like to add another grocery item? (y/n) ") == false) {
//                return groceries;
//            }
            System.out.println("Would you like to add another grocery item? (y/n) ");
            if(!input.yesNo()){
                return groceries;
            }
        }
    }

    private static void printGroceryCategories() {
        System.out.println("Grocery Categories:");
        System.out.println("1. Produce");
        System.out.println("2. Meats");

    }

    private static void printGroceryList(ArrayList<GroceryItem> groceries) {
        // 1. for each category
        printGroceryListByCategory(PRODUCE, groceries);
        printGroceryListByCategory(MEATS, groceries);
    }

    private static void printGroceryListByCategory(int category, ArrayList<GroceryItem> groceries) {
        // 2. fetch the grocery items for that category
        ArrayList<GroceryItem> categoryItems = new ArrayList<>();

        for(GroceryItem groceryItem : groceries) {
            if(groceryItem.getCategoryNum() == category) {
                categoryItems.add(groceryItem);
            }
        }
        // at this point, categoryItems has the grocery items for the given category

        // 3. sort them alphabetically
        Collections.sort(categoryItems);

        // 4. print them w quantity
        if(category == PRODUCE) {
            System.out.println("PRODUCE:");
        } else {
            System.out.println("MEATS:");
        }
        System.out.println(categoryItems);
    }


}

