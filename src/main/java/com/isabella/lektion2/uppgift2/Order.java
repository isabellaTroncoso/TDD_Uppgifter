package com.isabella.lektion2.uppgift2;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Discount discount;
    private List<Item> items = new ArrayList<>();

    public Order(Discount discount) {
        this.discount = discount;
    }


    public void addItem(Item item) {
        items.add(item);
    }
    double calculateTotalBeforeDiscount(){
    double total = 0;

    for (Item item : items) {
        total += item.getTotalPrice();

    }
    return total;
   }

   double calculateDiscountAmount(){
       double totalBeforeDiscount = calculateTotalBeforeDiscount();
       return discount.getDiscount(totalBeforeDiscount);
   }

    public double calculateTotalAfterDiscount() {
        double totalBeforeDiscount = calculateTotalBeforeDiscount();
        double discountAmount = calculateDiscountAmount();
        return totalBeforeDiscount - discountAmount;
    }

    public void printSummary() {
        double totalBeforeDiscount = calculateTotalBeforeDiscount();
        double discountAmount = calculateDiscountAmount();
        double totalAfterDiscount = calculateTotalAfterDiscount();

        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);

        System.out.println("Another total before discount: $" + totalBeforeDiscount);
        System.out.println("Another total after discount: $" + totalAfterDiscount);
    }



}
