package com.gcu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderModel {

	private long id;
	
	private String orderNo;
	
	private String productName;
	
	private float price;
	
	private int quantity;
	
}
