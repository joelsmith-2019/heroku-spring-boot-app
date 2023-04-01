package com.gcu.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gcu.model.OrderModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnotherOrderBusinessService implements OrderBusinessServiceInterface {

    @Override
    public void test() {
        log.info("Enter: AnotherOrderBusinessService.test()");
        System.out.println("Hello from the AnotherOrderBusinessService class.");
        log.info("Exit: AnotherOrderBusinessService.test()");
    }

    @Override
    public List<OrderModel> getOrders() {
		log.info("Enter: AnotherOrderBusinessService.getOrders()");
		ArrayList<OrderModel> orderModels = new ArrayList<>(Arrays.asList(
				new OrderModel(0L, "0000000001", "Product 1", 1f, 1),
				new OrderModel(1L, "0000000002", "Product 2", 2f, 2),
				new OrderModel(2L, "0000000003", "Product 3", 3f, 3),
				new OrderModel(3L, "0000000004", "Product 4", 4f, 4),
				new OrderModel(4L, "0000000005", "Product 5", 5f, 5)
		));
		log.info("Exit: AnotherOrderBusinessService.getOrders()");
		return orderModels;
    }

    @Override
    public void init() {
		log.info("Enter: AnotherOrderBusinessService.init()");
        System.out.println("Init from order business service");
		log.info("Exit: AnotherOrderBusinessService.init()");
    }

    @Override
    public void destroy() {
        log.info("Enter: AnotherOrderBusinessService.destroy()");
        System.out.println("Destroy from order business service");
        log.info("Exit: AnotherOrderBusinessService.destroy()");
    }
}
