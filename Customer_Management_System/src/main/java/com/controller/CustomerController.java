package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/add")
	public void save()
	{
		customerServiceImpl.addCust();
	}
	
//	@DeleteMapping("/delete")
//	public void deleteAll() 
//	{
//		customerServiceImpl.deleteCust();
//	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		System.out.println("id"+id);
		return customerServiceImpl.deleteCustomer(id);
	}
	
	
	@PutMapping("update")
	public String UpdateCustomer(@RequestBody Customer customer) {
		customerServiceImpl.UpdateCustomer(customer);
		return "Record Updated Successfully";
	}
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomers(){
		return customerServiceImpl.getCustomers();
	}
	
	@GetMapping("/{custName}")
	public Customer findCustomerByName(@PathVariable String custName)
	{
		return customerServiceImpl.getCustomersByName(custName);
	}
}
