package com.gcu.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.model.OrderModel;

public class OrderBusinessService implements OrderBusinessServiceInterface {
	
	@Autowired
	private OrderDataService service;

	@Override
	public void test() {
		System.out.println("Hello from the OrderBusinessService!");

	}

	@Override
	public List<OrderModel> getOrders() {
		return service.findAll().stream().map(entity -> new OrderModel(entity.getId(), entity.getOrderNo(),
				entity.getProductName(), entity.getPrice(), entity.getQuantity())).collect(Collectors.toList());
	}

	@Override
	public void init() {
		System.out.println("Init from order business service");

	}

	@Override
	public void destroy() {
		System.out.println("Destroy from order business service");

	}
}
