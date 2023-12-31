package com.example.Order_details.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	@Id
	int id;
	Date Date_Of_Purchase;
	float total;
	int customer_id;
	String payment_mode;
	int shop_id;
	public OrderDetails() {
		super();
	}
	public OrderDetails(int id, Date Date_Of_Purchase, float total, int customer_id, String payment_mode, int shop_id) {
		super();
		this.id = id;
		this.Date_Of_Purchase = Date_Of_Purchase;
		this.total = total;
		this.customer_id = customer_id;
		this.payment_mode = payment_mode;
		this.shop_id = shop_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_Of_Purchase() {
		return Date_Of_Purchase;
	}
	public void setDate_Of_Purchase(Date date_Of_Purchase) {
		Date_Of_Purchase = date_Of_Purchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
}
