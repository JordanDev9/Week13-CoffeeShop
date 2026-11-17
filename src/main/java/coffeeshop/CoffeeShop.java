package coffeeshop;
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
    private double totalsales;
    private CoffeeShop shop;
    private Scanner input;

   public CoffeeShop(String name){

   }
   public String getName(){
       this.name = name;
       return name;
   }
   public Menu getMenu(){
       this.menu = menu;
       return menu;
   }
   public double checkout(Order order, int tipPercent){
       return 0;
   }
   public int getCompletedOrders(){
       return 0;
   }
   public double getTotalSales() {
       return 0;
   }
   public int getItemsSold(){
       return 0;
   }
   public String salesReport(){
        return null;
    }







}
