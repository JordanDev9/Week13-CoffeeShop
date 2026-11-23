package coffeeshop;

// STEP 3 · Menu: the 8 things the shop sells.
//
// Open UML.md and find "Step 3 · Menu". The table there lists the 8 items, in order.
//   1 private field: items   (an ArrayList<MenuItem>)
//   1 constructor:   Menu(). It makes the list and adds the 8 items.
//   3 methods:       size(), getItem(int number), toString()
//
// Then drag check/coffeeshop/MenuTest.java into src/test/java/coffeeshop/ and run it.
// Commit message:  step 3: Menu

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> Items = new ArrayList<MenuItem>();
    private Menu menu;




    public Menu(){
        Items.add(new Drink("Coffee", 2.00, 'S'));
        Items.add(new Drink("Latte", 3.25, 'S'));
        Items.add(new Drink("Cappuccino", 3.25, 'S'));
        Items.add(new Drink("Hot Chocolate", 2.50, 'S'));
        Items.add(new Drink("Iced Tea", 2.25, 'S'));

        Items.add(new Food("Bagel", 2.75, false));
        Items.add(new Food("Blueberry Muffin", 2.50, false));
        Items.add(new Food("Breakfast Sandwich", 4.50, false));

    }
    public int size(){
        return Items.size();
    }
    public MenuItem getItem(int number){
        if (number < 1 || number > Items.size()) {
            return null;
        }

        return Items.get(number - 1);
    }
    @Override
    public String toString() {

        String menu = "";

        for (int i = 0; i < Items.size(); i++) {
            menu += (i + 1) + ". " + Items.get(i) + "\n";
        }
        return menu;
    }




}
