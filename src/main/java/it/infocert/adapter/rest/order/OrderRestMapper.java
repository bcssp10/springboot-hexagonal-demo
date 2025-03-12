package it.infocert.adapter.rest.order;

import it.infocert.domain.Order;

public class OrderRestMapper {

    public static Order toOrder(OrderDTO orderDTO) {
        var order = new Order(orderDTO.getId(), orderDTO.getItem(), orderDTO.getQuantity());
        return order;
    }

    public static OrderDTO toOrderDTO(Order order) {
        var orderDTO = new OrderDTO(order.getId(), order.getItem(), order.getQuantity());
        return orderDTO;
    }

}
