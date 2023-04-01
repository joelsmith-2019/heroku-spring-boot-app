package com.gcu.business;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.OrderList;
import com.gcu.model.OrderModel;

@Slf4j
@RestController
@RequestMapping("/service")
public class OrdersRestService {

	@Autowired
	private OrderBusinessServiceInterface service;

	@GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrdersAsJson() {
		log.info("Enter: OrdersRestService.getOrdersAsJson()");
		List<OrderModel> orders = this.service.getOrders();
		log.info("Exit: OrdersRestService.getOrdersAsJson()");
		return orders;
	}
	
	@GetMapping(path="/getxml", produces = { MediaType.APPLICATION_XML_VALUE})
	public OrderList getOrdersAsXml() {
		log.info("Enter: OrdersRestService.getOrdersAsXml()");
		OrderList list = new OrderList();
		list.setOrders(service.getOrders());
		log.info("Exit: OrdersRestService.getOrdersAsXml()");
		return list;
	}

}
