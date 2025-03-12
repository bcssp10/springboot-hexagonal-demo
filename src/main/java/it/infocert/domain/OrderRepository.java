package it.infocert.domain;

public interface OrderRepository {
    void save(Order order);
    Order findById(Long id);
}
