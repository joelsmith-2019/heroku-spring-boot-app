package com.gcu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global Exception Handler(s). Used as a fallback when an error occurs, and we don't want to expose any information.
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Base Exception handler.
     *
     * @param ex Exception
     */
    @ExceptionHandler({Exception.class})
    public void handleException(Exception ex) {
        log.error("Exception: " + ex.getMessage());
    }
}