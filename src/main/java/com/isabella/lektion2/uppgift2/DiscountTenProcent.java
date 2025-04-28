package com.isabella.lektion2.uppgift2;

public class DiscountTenProcent implements Discount{
    @Override
    public double getDiscount(double total) {
        return total * 0.10;
    }
}
