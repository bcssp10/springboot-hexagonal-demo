package it.infocert.adapter.jpa.order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String item;

    @Column
    private int quantity;

    public OrderEntity(Long id) {
        this.id = id;
    }

    public OrderEntity(Long id, String item, int quantity) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}