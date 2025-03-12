package it.infocert.domain;

public class Order {
    private final Long id;
    private final String item;
    private final int quantity;

    // Constructor, getters, and setters
    public Order(Long id, String item, int quantity) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}