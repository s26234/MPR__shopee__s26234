package com.mja.shopee__s26234;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopeeServiceTests {
private ShopeeStorage shopeeStorage;
private Cart cart;


    @Test
    public void isSaldoChanged() {
    ShopeeService shopeeService = new ShopeeService(ShopeeStorage shopeeStorage, Cart cart));
        Customer customer = new Customer(1,200);
        Cart cart = new Cart(customer);
        cart.addItemToCar("beer");

        int customerSaldoBefore = customer.getBalance();
        shopeeService.orderItems(cart);
        int customerSaldoAfter = customer.getBalance();
        assertThat(customerSaldoBefore).isNotEqualTo(customerSaldoAfter);

    }

}
