package com.example.demo.serviceinterface;

import org.springframework.http.ResponseEntity;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;

import jakarta.validation.Valid;

public interface CustomerServiceInterface {
	
	

	CustomerDto saveCustomer(@Valid Customer customer);

}
