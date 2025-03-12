package it.infocert.adapter.rest.order;

import it.infocert.domain.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderUseCase) {
        this.orderService = orderUseCase;
    }

    @PostMapping
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        var order = OrderRestMapper.toOrder(orderDTO);
        orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public OrderDTO getOrder(@PathVariable Long id) {
        var order =  orderService.getOrderById(id);
        return OrderRestMapper.toOrderDTO(order);
    }
}