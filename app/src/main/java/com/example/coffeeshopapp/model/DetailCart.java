package com.example.coffeeshopapp.model;

public class DetailCart {
    private int idCart;
    private int idProduct;
    private int Quantity;
    private int AmountOfMoney;

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        AmountOfMoney = amountOfMoney;
    }

    public DetailCart(int idCart, int idProduct, int quantity, int amountOfMoney) {
        this.idCart = idCart;
        this.idProduct = idProduct;
        Quantity = quantity;
        AmountOfMoney = amountOfMoney;
    }

    public DetailCart() {
    }
}
