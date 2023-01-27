package com.mja.shopee__s26234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ShopeeS26234Application {
	private final ShopeeService shopeeService;
	public ShopeeS26234Application(ShopeeService shopeeService) {
		this.shopeeService = shopeeService;

		Customer customer = new Customer(1, 200);
		Cart cart = new Cart(customer);
		cart.addItemToCar("milk");
		cart.addItemToCar("milk");
		cart.addItemToCar("beer");
		shopeeService.orderItems(cart);
	}

		public static void main(String[] args) {
			SpringApplication.run(ShopeeS26234Application.class, args);
		}

}
