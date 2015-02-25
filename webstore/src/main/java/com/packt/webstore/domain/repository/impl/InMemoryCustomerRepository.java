package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
//		Customer Leo = new Customer();
//		Leo.setName("Leo");
//		Leo.setCustomerId("20141027_leo");
//		Leo.setAddress("Xintai");
//		Leo.setNoOfOrdersMade("order1");
//		
//		Customer Karen = new Customer();
//		Karen.setName("Karen");
//		Karen.setCustomerId("20141027_karen");
//		Karen.setAddress("Jiaozuo");
//		Karen.setNoOfOrdersMade("order1");
//		
//		Customer Xiangxiang = new Customer();
//		Xiangxiang.setName("Xiangxiang");
//		Xiangxiang.setCustomerId("20141027_xiangxiang");
//		Xiangxiang.setAddress("Qingdao");
//		Xiangxiang.setNoOfOrdersMade("order1");
//		
//		listOfCustomers.add(Leo);
//		listOfCustomers.add(Karen);
//		listOfCustomers.add(Xiangxiang);
	}
	
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return listOfCustomers;
	}

}
