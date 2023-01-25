package com.gcu.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.data.repository.OrdersRepository;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity> {

	@Autowired
	private OrdersRepository ordersRepository;
	
	private DataSource dataSource;
	
	private JdbcTemplate template;

	public OrderDataService(OrdersRepository ordersRepository, DataSource dataSource) {
		this.ordersRepository = ordersRepository;
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public List<OrderEntity> findAll() {
		return StreamSupport.stream(this.ordersRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(OrderEntity order) {
		
		String sql = "INSERT INTO orders (ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES (?, ?, ?, )";
		
		try {
			this.template.update(sql, order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

}
