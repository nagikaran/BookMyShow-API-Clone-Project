package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.serviceinterface.CustomerServiceInterface;

import jakarta.validation.Valid;

@Service
public class CustomerService implements CustomerServiceInterface {
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	CustomerDto customerDto;

	@Override
	public CustomerDto saveCustomer(@Valid Customer customer) {
		// TODO Auto-generated method stub
		
		Customer dbSaveCustomer = customerDao.saveCustomer(customer);
		if(dbSaveCustomer!=null) {
			customerDto.setCustomerId(dbSaveCustomer.getCustomerId());
			customerDto.setCustomerName(dbSaveCustomer.getCustomerName());
			customerDto.setCustomerEmail(dbSaveCustomer.getCustomerEmail());
			customerDto.setCustomrPhoneNumber(dbSaveCustomer.getCustomrPhoneNumber());
			
		}
		CustomerDto entityToCustomerClassDto = entityToCustomerClassDto(dbSaveCustomer);
		
		return entityToCustomerClassDto;
	}
	
	
	/*create the methods to create the dto to the entity and the entity to the dto*/
	private Customer dtoToCustomerClass(CustomerDto dto) {
		ModelMapper mm = new ModelMapper();
		return mm.map(dto, Customer.class);
	}

	private CustomerDto entityToCustomerClassDto(Customer entity) {
		ModelMapper mm = new ModelMapper();
		return mm.map(entity, CustomerDto.class);
	}
	
}
