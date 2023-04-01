package com.gcu.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SecurityBusinessService {
	
	public boolean authenticate(String username, String password) {
		log.info("Enter: SecurityBusinessService.authenticate()");
		System.out.println("Hello from the security business service");
		log.info("Exit: SecurityBusinessService.authenticate()");
		return true;
	}
	
}
