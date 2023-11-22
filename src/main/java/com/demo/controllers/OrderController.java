package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.models.Order;
import com.demo.service.OrderService;

@RestController
public class OrderController {

		@Autowired
		OrderService orderService;
		
		@PostMapping("/saveOrder")
		public String saveOrder(@RequestBody Order order) {
			orderService.saveOrder(order);
			return "Order saved ...";
		}
		
		@GetMapping("/getAllOrders")
		public List<Order> getAllOrder() {
			return orderService.getAllOrder();
		}
		
		@GetMapping("/getOrder/{orderNo}")
		public Optional<Order> getOrder(@PathVariable("orderNo") Long orderNo) {
			return orderService.getOrderById(orderNo);
		}
		
		@DeleteMapping("deleteOrder/{orderNo}")
		public void deleteOrder(@PathVariable("orderNo") Long orderNo) {
			orderService.deleteOrder(orderNo);
		}
		
		
}
