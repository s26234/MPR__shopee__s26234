package com.mja.shopee__s26234;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Cart {
    private Customer customer;
    private ShopeeStorage shopeeStorage;
    private int sum = 0;

    private List<String> carItems = new ArrayList<>();
    public Cart(Customer customer) {
        this.customer = customer;
    }

    public void addItemToCar(String itemName) {
        carItems.add(itemName);
        sum = shopeeStorage.getPriceByName(itemName);
    }

    public List<String> getItemList() {
        return carItems;
    }

    public int getSum() {
        return sum;
    }

    public Customer getCustomer() {
        return customer;
    }
}
