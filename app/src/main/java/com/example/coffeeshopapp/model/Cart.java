package com.example.coffeeshopapp.model;

public class Cart {
    private int idCart;
    private int idCustomer;

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Cart(int idCart, int idCustomer) {
        this.idCart = idCart;
        this.idCustomer = idCustomer;
    }

    public Cart() {
    }
}
