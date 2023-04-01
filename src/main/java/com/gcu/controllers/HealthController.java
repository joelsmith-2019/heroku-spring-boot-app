package com.gcu.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("")
    public ResponseEntity<?> checkHealth() {
        log.info("Enter: HealthController.checkHealth()");
        log.info("Exit: HealthController.checkHealth()");
        return ResponseEntity.ok().build();
    }
}
