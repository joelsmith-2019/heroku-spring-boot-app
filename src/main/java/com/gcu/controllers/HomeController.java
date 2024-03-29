package com.gcu.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("")
public class HomeController {

	@RequestMapping("")
	public String getHome() {
		log.info("Enter: HomeController.getHome()");
		log.info("Exit: HomeController.getHome()");
		return "home";
	}

}
