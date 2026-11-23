package coffeeshop;
import java.util.ArrayList;
import java.util.Scanner;

// STEP 5 · CoffeeShop: the shop, its menu, and every order it finished today.
//
// Open UML.md and find "Step 5 · CoffeeShop".
//   4 private fields: name, menu, completedOrders, totalSales
//   1 constructor:    CoffeeShop(String name)
//   7 methods:        getName(), getMenu(), checkout(), getOrdersCompleted(),
//                     getTotalSales(), getItemsSold(), salesReport()
//
// Then drag check/coffeeshop/CoffeeShopTest.java into src/test/java/coffeeshop/ and run it.
// Commit message:  step 5: CoffeeShop

public class CoffeeShop {
    private String name;
    private Menu menu;
    private double totalSales;
    private CoffeeShop Shop;
    private Scanner input;
    private ArrayList<Order> completedOrders;

    public CoffeeShop(String name) {
        this.name = name;
        menu = new Menu();
        completedOrders = new ArrayList<Order>();
        totalSales = 0;
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public Menu getMenu() {
        menu = new Menu();
        return menu;
    }

    public double checkout(Order order, int tipPercent) {
        if (order.isEmpty()) {
            return 0;
        }

        double total = order.getTotal(tipPercent);

        completedOrders.add(order);
        totalSales += total;

        return total;
    }

    public int getOrdersCompleted() {
        return completedOrders.size();
    }

    public double getTotalSales() {
        return totalSales;
    }

    public int getItemsSold() {
        int itemsSold = 0;

        for (Order order : completedOrders) {
            itemsSold += order.getItemCount();
        }

        return itemsSold;
    }

    public String salesReport() {

        return getName() + " - today's sales\n"
                + "  Orders: " + getOrdersCompleted() + "\n"
                + "  Items sold: " + getItemsSold() + "\n"
                + "  Total: $"
                + String.format("%.2f", getTotalSales());
    }
}

