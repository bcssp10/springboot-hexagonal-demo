package it.infocert.adapter.rest.order;

public class OrderDTO {
    private Long id;
    private String item;
    private int quantity;

    // Constructor, getters, and setters
    public OrderDTO(Long id, String item, int quantity) {
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