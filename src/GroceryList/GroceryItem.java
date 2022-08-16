package GroceryList;
//package java_two.collections_exercise;

public class GroceryItem implements Comparable {
    private String name;
    private int categoryNum;
    private int quantity;

    public GroceryItem(String name, int categoryNum, int quantity) {
        this.name = name;
        this.categoryNum = categoryNum;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", categoryNum=" + categoryNum +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Object o) {
        GroceryItem otherItem = (GroceryItem) o;
        return this.getName().compareTo(otherItem.getName());
//        return 0;
    }
}
