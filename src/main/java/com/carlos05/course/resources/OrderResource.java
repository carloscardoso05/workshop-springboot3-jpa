package com.carlos05.course.resources;

import com.carlos05.course.entities.Order;
import com.carlos05.course.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {
    private final OrderService service;

    public OrderResource(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orders = service.findAll();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order order = service.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
