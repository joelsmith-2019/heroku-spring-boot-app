package com.gcu.business;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.model.OrderModel;

@Slf4j
public class OrderBusinessService implements OrderBusinessServiceInterface {
	
	@Autowired
	private OrderDataService service;

	@Override
	public void test() {
		log.info("Enter: OrderBusinessService.test()");
		System.out.println("Hello from the OrderBusinessService!");
		log.info("Exit: OrderBusinessService.test()");
	}

	@Override
	public List<OrderModel> getOrders() {
		log.info("Enter: OrderBusinessService.getOrders()");
		List<OrderModel> collect = service.findAll().stream().map(entity -> new OrderModel(entity.getId(), entity.getOrderNo(),
				entity.getProductName(), entity.getPrice(), entity.getQuantity())).collect(Collectors.toList());
		log.info("Exit: OrderBusinessService.getOrders()");
		return collect;
	}

	@Override
	public void init() {
		log.info("Enter: OrderBusinessService.init()");
		log.info("Exit: OrderBusinessService.init()");
	}

	@Override
	public void destroy() {
		log.info("Enter: OrderBusinessService.destroy()");
		log.info("Exit: OrderBusinessService.destroy()");
	}
}
