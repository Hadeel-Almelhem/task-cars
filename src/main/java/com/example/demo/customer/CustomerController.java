package com.example.demo.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
		
	//get all customers in database
	@GetMapping("/getCustomers")
	public List<Customer> getCars(){
		return customerService.listAll();
	}
	
	
	// add customer to database
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody List<Customer> customer) {
		customerService.save(customer);
	}
	
	
}
