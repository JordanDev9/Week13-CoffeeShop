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




    public void Menu(){
        Items.add(new Drink("Coffee", 2.00, 'S'));
        Items.add(new Food("Bagel", 2.75, false));

    }
    public int size(){
        return 0;
    }
    public MenuItem getItem(int number){
        return null;
    }
    public String toString(){
        return null;
    }




}
