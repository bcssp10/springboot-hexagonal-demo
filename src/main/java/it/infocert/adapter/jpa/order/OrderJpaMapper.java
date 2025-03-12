package it.infocert.adapter.jpa.order;

import it.infocert.domain.Order;

public class OrderJpaMapper {

    public static Order toOrder(OrderEntity orderEntity) {
        var order = new Order(orderEntity.getId(), orderEntity.getItem(), orderEntity.getQuantity());
        return order;
    }

    public static OrderEntity toOrderEntity(Order order) {
        var orderDTO = new OrderEntity(order.getId(), order.getItem(), order.getQuantity());
        return orderDTO;
    }

}