package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void addCust() {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("Pooja",5000));
		list.add(new Customer("Sumedha",4000));
		list.add(new Customer("Alisha",3000));
		
		for (Customer c:list)
		{
			customerRepository.save(c);
		}
	}
	

	public String deleteCustomer(int id) {
		customerRepository.deleteById(id);
		return "Record Deleted";
	}
	
	public void addCustomerFew(List<Customer> customer) {
		customerRepository.saveAll(customer);
	}
	
	public Customer UpdateCustomer(Customer customer) {
		Customer existingCustomer = customerRepository.findById(customer.getCustId()).orElse(null);
		existingCustomer.setCustName(customer.getCustName());
		existingCustomer.setAmount(customer.getAmount());
		return customerRepository.save(existingCustomer);
	}
	
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomersByName(String custName) {
		return customerRepository.findByCustName(custName);
	}
	
}
