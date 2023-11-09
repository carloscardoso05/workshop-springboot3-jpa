package com.carlos05.course.repositories;

import com.carlos05.course.entities.OrderItem;
import com.carlos05.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
