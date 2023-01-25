package com.Technosignia.CustomerService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.CustomerService.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}
