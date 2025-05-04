package vn.banhmi.goBread.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.banhmi.goBread.domain.Order;
import vn.banhmi.goBread.domain.User;
import vn.banhmi.goBread.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    public User handleSaveOrder(Order order) {
        Order order2 = this.orderRepository.save(order);
        System.out.println(order);
        return order2;
    }
    // Add methods to handle order-related operations here
    // For example, you can create methods to save, update, delete, or retrieve
    // orders
}