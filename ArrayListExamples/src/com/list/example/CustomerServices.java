package com.list.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerServices {

	private ArrayList<Customer> list;

	public CustomerServices() {
		list=new ArrayList<>();
	}

	public ArrayList<Customer> getAllCustomer(){
		return list;
	}
	
	public boolean addCustomer(Customer customer) {
		return list.add(customer);
	}
	public Customer getCustomerById(int id) {	
		return list.get(id-1);
	}
	
	public void deleteCustomerById(int id) {
		list.remove(id-1);
	}
	
	public void updateCustomer(Customer cust,int id) {
	
			list.set(list.indexOf(getCustomerById(id)),cust);	
	}
	
	public ArrayList<Customer> sortCustomerByNames(){	
		Comparator<Customer> cust=Comparator.comparing(Customer::getName);
		Collections.sort(list,cust);
		return list;
	}
	
	public int getNumberOfCustomer() {
		return list.size();
	}
	
	
	
	
}

