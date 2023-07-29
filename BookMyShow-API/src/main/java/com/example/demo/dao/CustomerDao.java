package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import jakarta.validation.Valid;

@Repository
public class CustomerDao {
	
	@Autowired
	CustomerRepository customerRepo;

	public Customer saveCustomer(@Valid Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
		
		
	}
	
	
	
	
	
	
	

}
