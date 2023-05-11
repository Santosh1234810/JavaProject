package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public interface CustomerService {
	void addCust();
	
	ArrayList<Customer> findAllCustomer();
	
	Customer findAllCustomerById(int custid);
	void deleteCust();
	
	ArrayList<Customer> findAllCustomers();
	
	Customer findAllCustomerByID(int cid);
	void deleteCustomer();
	
	String deleteAuther(int id);
	void addCustomer(List <Customer> customers);
	
	Customer updateCustomer(Customer customer);
	
	List<Customer> getCustomers();
	
	Customer getCustomersByName(String custName);
	
}
