package com.Technosignia.CustomerService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.CustomerService.dao.CustomerRepository;
import com.Technosignia.CustomerService.entity.Customer;

@Service
public class CustomerService {
@Autowired
CustomerRepository customerRepository;
	public Customer createCustomer(Customer cust) {
		
		return customerRepository.save(cust);
	}

}
