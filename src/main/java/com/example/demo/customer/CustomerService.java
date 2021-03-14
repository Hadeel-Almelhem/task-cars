package com.example.demo.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	public void save(List<Customer> customer) {
		customerRepository.saveAll(customer);
		
	}

	public void addCust(Customer customer) {
		customerRepository.save(customer);
		
	}
}
