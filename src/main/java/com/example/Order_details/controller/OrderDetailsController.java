package com.example.Order_details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Order_details.entity.OrderDetails;
import com.example.Order_details.service.OrderDetailsService;

@RestController
@RequestMapping("/orders")
public class OrderDetailsController {
	@Autowired
	OrderDetailsService orderDetailsService;
	
	public OrderDetailsService getOrderDetailsService() {
		return orderDetailsService;
	}
	
	public void setOrderDetailsService(OrderDetailsService orderDetailsService) {
		this.orderDetailsService = orderDetailsService;
	}
	
	// http://localhost:8071/employees/create - Post
	@PostMapping("/create")
	public OrderDetails addOrderDetails(@RequestBody OrderDetails employee)
	{
	return orderDetailsService.save(employee);
	}
	// http://localhost:8071/employees/2 -GET
	@GetMapping(path="/{id}")
	public OrderDetails getOrderDetails(@PathVariable int id)
	{
	return orderDetailsService.getOrderDetails(id); 
	}
	//http://localhost:8071/employees/id -PUT
	@PutMapping(path="/{id}") 
	public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderDetails,@PathVariable int id)
	{
	return orderDetailsService.update(id,orderDetails); 
	}
	//http://localhost:8071/employees/2 -DELETE
	@DeleteMapping(path="/{id}")
	public String deleteOrderDetails(@PathVariable int id)
	{
	return orderDetailsService.delete(id); 
	}
	//http://localhost:8071/employees GET
	@GetMapping
	public List<OrderDetails> getAllOrderDetails()
	{
	return orderDetailsService.getOrderDetailsList();
	}

}
