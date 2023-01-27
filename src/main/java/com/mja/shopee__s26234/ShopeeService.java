package com.mja.shopee__s26234;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ShopeeService {

    private ShopeeStorage shopeeStorage;
    private Cart cart;
    private int sum = 0;

    public ShopeeService(ShopeeStorage shopeeStorage, Cart cart) {
        this.shopeeStorage = shopeeStorage;
        this.cart = cart;
    }

    public List<String> getAllItemsFromCart() {
        return cart.getItemList();
    }

    public void orderItems(Cart cart) {
        Customer customer = cart.getCustomer();
        int customerSaldo = cart.getCustomer().getBalance();
        int sum = cart.getSum();

        if (customerSaldo >= sum) {
            int saldo = customerSaldo - sum;
            System.out.println("Udalo sie. Zaplacisz");
        }
    }


}
