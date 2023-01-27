package com.mja.shopee__s26234;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int id;
    private int balance;

    public Customer(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(int saldo) {
        this.balance = saldo;
    }

}
