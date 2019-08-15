package com.project.linkedin.dao;

import java.util.List;

import com.project.linkedin.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theID);

	public void deleteCustomer(int theId);


}
