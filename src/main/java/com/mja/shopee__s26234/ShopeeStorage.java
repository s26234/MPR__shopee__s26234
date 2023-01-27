package com.mja.shopee__s26234;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ShopeeStorage {

    private Cart cart;
    private Item milk = new Item("milk", 4);
    private Item beer = new Item("beer",5);
    private Item bread = new Item("bread", 6);
     private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }
    public ShopeeStorage () {
        itemList.add(milk);
        itemList.add(beer);
//        itemList.add(new Item("milk",4));
//        itemList.add(new Item("beer",5));
    }

    public int getPriceByName(String itemName) {
        for(Item item : itemList) {
            if(item.getItemName() == itemName) {
                return item.getPrice(itemName);
            }
        }
        return 0;
    }

}
