package com.carlos05.course.services;

import com.carlos05.course.entities.Order;
import com.carlos05.course.entities.User;
import com.carlos05.course.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

//    public List<Order> findByClient(User client){
//        return repository.findBy(new Order(null, null, client));
//    }

    public Order findById(Long id) {
        return repository.findById(id).get();
    }
}
