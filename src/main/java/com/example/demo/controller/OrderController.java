package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
	
	 private final OrderRepository orderRepository;

	    @Autowired
	    public OrderController(OrderRepository orderRepository) {
	        this.orderRepository = orderRepository;
	    }

	    @DeleteMapping("/{orderId}")
	    public ResponseEntity<String> deleteOrder(@PathVariable Long orderId) {
	        if (orderRepository.existsById(orderId)) {
	            orderRepository.deleteById(orderId);
	            return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Order not found", HttpStatus.NOT_FOUND);
	        }
	    }

}
