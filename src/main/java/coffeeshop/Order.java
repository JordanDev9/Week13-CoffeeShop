package coffeeshop;

import java.util.ArrayList;

// STEP 4 · Order: one customer's order.
//
// Open UML.md and find "Step 4 · Order". This is the biggest class. Build it one method at a
// time, and run the test after each one.
//   2 constants:      COUPON_CODE, COUPON_PERCENT   (public static final)
//   1 static field:   nextOrderNumber, starts at 1
//   3 private fields: orderNumber, items, discountPercent
//   1 constructor:    Order()
//   10 methods:       getOrderNumber(), addItem(), removeItem(), getItemCount(), isEmpty(),
//                     getSubtotal(), applyCoupon(), getDiscount(), getTotal(), toString()
//
// Then drag check/coffeeshop/OrderTest.java into src/test/java/coffeeshop/ and run it.
// Commit message:  step 4: Order

public class Order {
    ArrayList<String> completedorders = new ArrayList<String>();
    private Order order;
    final public String COUPONCODE = "HORNET 10";
    final public int COUPONPERCENT = 10;
    private int nextOrderNumber = 1;
    ArrayList<MenuItem> Items = new ArrayList<MenuItem>();
    private int discountPercentage;

    public void Order(){

    }
    public int getOrderNumber(){
        return 0;
    }
    public void addItem(MenuItem item){

    }
    public boolean removeItem(int number){
        return true;
    }
    public int getItemCount(){
        return 0;
    }
    public boolean isOpen(){
        return true;
    }
    public double getSubTotal(){
        return 0;
    }
    public boolean applyCoupon(String code){
        return true;
    }
    public double getDiscount(){
        return 0;
    }
    public double getTotal(int tipPercentage){
        return 0;
    }
    public String toString() {
        return null;
    }

    // YOUR CODE

}
