package com.mja.shopee__s26234;

import org.springframework.stereotype.Component;

public class Item {
    private String itemName;
    private int price;
public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice(String itemName) {
        return price;
    }
}
