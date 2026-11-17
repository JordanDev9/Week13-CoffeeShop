package coffeeshop;

// STEP 1 · MenuItem: one thing you can buy at the coffee shop.
//
// Open UML.md and find "Step 1 · MenuItem". Build everything in that table:
//   2 private fields:  name, price
//   1 constructor:     MenuItem(String name, double price)
//   4 methods:         getName(), getPrice(), isDrink(), toString()
//
// Then drag check/coffeeshop/MenuItemTest.java into src/test/java/coffeeshop/ and run it.
// Commit message when it is all green:  step 1: MenuItem

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, Double price){

    }
    public String getName(){
        this.name = name;
        return name;
    }
    public double getPrice(){
        this.price = price;
        return price;
    }
    public boolean isDrink(){
        return true;
    }
    public String toString(){
        return name + " - $" + String.format("%.2f", getPrice());
    }

    // YOUR CODE

}
