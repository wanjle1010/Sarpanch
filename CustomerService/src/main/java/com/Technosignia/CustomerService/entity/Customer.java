package com.Technosignia.CustomerService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

Long id;

String name;

String address;

Long contact;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Long getContact() {
	return contact;
}

public void setContact(Long contact) {
	this.contact = contact;
}


}
