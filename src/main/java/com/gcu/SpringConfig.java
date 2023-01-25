package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gcu.business.OrderBusinessService;
import com.gcu.business.OrderBusinessServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name = "ordersBusinessService", initMethod = "init", destroyMethod = "destroy")
	public OrderBusinessServiceInterface getOrdersBusiness() {
		return new OrderBusinessService();
	}
}
