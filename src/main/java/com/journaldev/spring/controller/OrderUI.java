package com.journaldev.spring.controller;

import java.io.Serializable;

import org.springframework.stereotype.Service;


public class OrderUI  {
	
//	private int orderid;
	private int user_id;
	private int book_id;
//	public int getOrderid() {
//		return orderid;
//	}
//	public void setOrderid(int orderid) {
//		this.orderid = orderid;
//	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public OrderUI(int user_id, int book_id) {
		super();
		
		this.user_id = user_id;
		this.book_id = book_id;
	}
	
	public OrderUI() {
		
	}
}
