package com.ecommerce.aafrincosmetics.repo;

import com.ecommerce.aafrincosmetics.entity.Order;
import com.ecommerce.aafrincosmetics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {

    List<Order> findByUser(User user);
}
