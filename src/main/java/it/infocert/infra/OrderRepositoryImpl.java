package it.infocert.infra;

import it.infocert.adapter.jpa.order.OrderJpaMapper;
import it.infocert.domain.Order;
import it.infocert.domain.OrderRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository orderJpaRepository;

    public OrderRepositoryImpl(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public void save(Order order) {
        var orderEntity = OrderJpaMapper.toOrderEntity(order);
        orderJpaRepository.save(orderEntity);

    }

    @Override
    public Order findById(Long id) {
        var orderEntity  = orderJpaRepository.findById(id);
        orderEntity.get().setQuantity(123);
//        var order = orderJpaRepository.findById(id)
//                .map(OrderJpaMapper::toOrder)
//                .orElse(null);
        return order;
    }
}
