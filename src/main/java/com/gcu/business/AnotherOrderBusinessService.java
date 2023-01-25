package com.gcu.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrderBusinessService implements OrderBusinessServiceInterface {

	@Override
	public void test() {
		System.out.println("Hello from the AnotherOrderBusinessService class.");

	}

	@Override
	public List<OrderModel> getOrders() {
		return new ArrayList<>(Arrays.asList(
				new OrderModel(0L, "0000000001", "Product 1", 1f, 1),
				new OrderModel(1L, "0000000002", "Product 2", 2f, 2),
				new OrderModel(2L, "0000000003", "Product 3", 3f, 3),
				new OrderModel(3L, "0000000004", "Product 4", 4f, 4),
				new OrderModel(4L, "0000000005", "Product 5", 5f, 5)
		));
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
