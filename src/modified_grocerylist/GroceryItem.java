package modified_grocerylist;
public class GroceryItem {
    private String name;
    private int quantity;

    public GroceryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static GroceryItem createFromString(String itemString) {
        String [] parts = itemString.split(":");
        return new GroceryItem(parts[0].trim(), Integer.parseInt(parts[1].trim()));
    }

    @Override
    public String toString() {
        return name + " : " + quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

