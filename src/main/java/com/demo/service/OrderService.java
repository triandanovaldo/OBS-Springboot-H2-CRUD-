package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Order;
import com.demo.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}
	
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}
	
	public Optional<Order> getOrderById(Long orderNo) {
		return orderRepository.findById(orderNo);
	}
	
	public void deleteOrder(Long orderNo) {
		orderRepository.deleteById(orderNo);
	}
}