package com.orderapp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orderapp.model.Order;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

	List<Order> findAll();
}
