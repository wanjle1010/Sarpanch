package com.Technosignia.CustomerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.CustomerService.entity.Customer;
import com.Technosignia.CustomerService.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	 
	CustomerService customerService;
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer cust) {
		return  customerService.createCustomer(cust);
	}

}
