package com.example.rentalservice.sandbox.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.net.ConnectException;

@RestControllerAdvice
public class RentAdvice {
    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<String> handleHttpClientError(HttpClientErrorException e) {
        if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie not found (404)");
        } else if (e.getStatusCode() == HttpStatus.BAD_REQUEST) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request to MovieService (400)");
        }
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Client error from MovieService: " + e.getMessage());
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> handleHttpServerError(HttpServerErrorException e) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("MovieService returned 500 – Internal error");
    }

    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<String> handleConnectionError(ResourceAccessException e) {
        if (e.getCause() instanceof ConnectException) {
            return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("MovieService is unavailable (ConnectException)");
        }
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("MovieService access error");
    }
}
