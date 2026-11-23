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
    final public String COUPONCODE = "HORNET 10";
    final public int COUPONPERCENT = 10;
    private int nextOrderNumber = 1;
    private int orderNumber;
    ArrayList<MenuItem> Items = new ArrayList<MenuItem>();
    private int discountPercentage;

    public Order(){
        orderNumber = nextOrderNumber;
        nextOrderNumber++;

    }
    public int getOrderNumber(){
        return orderNumber;
    }
    public void addItem(MenuItem item){
        Items.add(item);
    }
    public boolean removeItem(int number){
        if (number < 1 || number > Items.size()) {
            return false;
        }

        Items.remove(number - 1);
        return true;
    }
    public int getItemCount() {
        return Items.size();
    }
    public boolean isEmpty() {
        return Items.size() == 0;
    }
    public double getSubtotal() {
        double subtotal = 0;

        for (MenuItem item : Items) {
            subtotal += item.getPrice();
        }

        return subtotal;
    }
    public boolean applyCoupon(String code){
        if (code.trim().equalsIgnoreCase(COUPONCODE)) {
            discountPercentage = COUPONPERCENT;
            return true;
        }

        return false;
    }
    public double getDiscount(){
        return getSubtotal() * discountPercentage / 100.0;
    }
    public double getTotal(int tipPercentage){
        if (tipPercentage < 0) {
            tipPercentage = 0;
        }

        double afterDiscount =
                getSubtotal() - getDiscount();

        double tip =
                afterDiscount * tipPercentage / 100.0;

        return afterDiscount + tip;
    }
    @Override
    public String toString() {
        String orderText = "Order #" + getOrderNumber() + "\n";
        for (int i = 0; i < Items.size(); i++) {
            orderText += "  " + (i + 1) + ". " + Items.get(i) + "\n";
        }
        orderText += "  Subtotal: $"
                + String.format("%.2f", getSubtotal());
        if (getDiscount() > 0) {
            orderText += "\n  Discount: -$"
                    + String.format("%.2f", getDiscount());
        }
        return orderText;
    }
}
    // YOUR CODE
