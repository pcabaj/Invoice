package com.inherito.test.invoice;

public class Order {

    public Order(){}

    public Order(String product, int quantity, int cost) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
    }

    private String product;
    private int quantity;
    private int cost;
    private int price;
    private double tax;

    public double calculateTax(){
        double price = getPrice()*0.23;

        price*=100;
        price = Math.round(price);
        return price/=100;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice() {
        return cost*quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
