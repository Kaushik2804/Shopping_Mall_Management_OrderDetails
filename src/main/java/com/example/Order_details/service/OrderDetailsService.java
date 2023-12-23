package com.example.Order_details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Order_details.entity.OrderDetails;
import com.example.Order_details.repository.OrderDetailsRepository;
@Service
public class OrderDetailsService {
	@Autowired
	OrderDetailsRepository orderdetailsrepository;
	
	public OrderDetails save(OrderDetails orderdetails) {
		return orderdetailsrepository.save(orderdetails);
	}
	
	public OrderDetails getOrderDetails(int id) {
		return orderdetailsrepository.findById(id).get();
	}
	
	public OrderDetails update(int id, OrderDetails orderdetails) {
		OrderDetails od = orderdetailsrepository.findById(id).get();
		od.setDate_Of_Purchase(orderdetails.getDate_Of_Purchase());
		od.setTotal(orderdetails.getTotal());
		od.setCustomer_id(orderdetails.getCustomer_id());
		od.setPayment_mode(orderdetails.getPayment_mode());
		od.setCustomer_id(orderdetails.getCustomer_id());
		return orderdetailsrepository.save(od);
	}
	public String delete(int id) {
		orderdetailsrepository.deleteById(id);
		return "Entity deleted "+id;
	}
	
	public List<OrderDetails> getOrderDetailsList(){
		return orderdetailsrepository.findAll();
	}
	
	public OrderDetailsRepository getOrderDetailsRepository() {
		return orderdetailsrepository;
	}
	
	public void setOrderDetailsRepository(OrderDetailsRepository orderDetailsRepository) {
		this.orderdetailsrepository = orderDetailsRepository;
	}
}
