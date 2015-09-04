package com.twu.baseline;

public class Item {
    String itemName;
    double itemPrice;
    boolean isExempted;
    boolean isImported;

    public Item(String itemName, double itemPrice, boolean isExempted, boolean isImported) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isExempted = isExempted;
        this.isImported = isImported;
    }

    public double calculateTax() {
        return 0.0;
    }
}
