package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.serviceinterface.CustomerServiceInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceInterface customerService;

	@PostMapping
	public ResponseEntity<String> saveCustomer(@Valid @RequestBody Customer customer) {
		CustomerDto saveCustomer = customerService.saveCustomer(customer);
		return saveCustomer != null ? ResponseEntity.status(HttpStatus.CREATED).body("Data added success fully")
				: ResponseEntity.status(HttpStatus.CREATED).body("failed to save the data");
	}
	/* API to get the customer details as per the id */

}
