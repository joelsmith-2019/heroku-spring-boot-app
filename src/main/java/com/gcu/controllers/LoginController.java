package com.gcu.controllers;

import java.util.List;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrderBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private OrderBusinessServiceInterface service;
	
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("")
	public String display(Model model) {
		log.info("Enter: LoginController.display()");
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		log.info("Exit: LoginController.display()");
		return "login";
	}

	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		log.info("Enter: LoginController.doLogin()");
		
		// Send test message via service
		service.test();
		
		// Authenticate the security
		//security.authenticate(loginModel.getUsername(), loginModel.getPassword());

		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		List<OrderModel> orders = service.getOrders();
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);

		System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(),
				loginModel.getPassword()));

		log.info("Exit: LoginController.doLogin()");
		return "orders";
	}

}
