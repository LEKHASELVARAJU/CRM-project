package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo cr;
	public List<Customer> postinfo(List<Customer> c)
	{
		return (List<Customer>) cr.saveAll(c);
	}
	public List<Customer> getinfo()
	{
		return (List<Customer>) cr.findAll();
	}
	public Optional<Customer> getinfoid(int id)
	{
		return (Optional<Customer>) cr.findById(id);
	}
	public void update(String id1 ,int id)
	{
		 cr.updateProduct(id1,id);
	}
	public String updateinfoid(int id,Customer ss) {
	   	 cr.saveAndFlush(ss);
	   	 if(cr.existsById(id)) {
	   		 return "UPDATED";
	   	 }else {
	   		 return "ENTER VALID CUST_ID";
	   	 }
	    }
	public void del(int id)
	{
		cr.deleteById(id);
	}
	public List<Customer> sortinfo(String s){
	   	 return cr.findAll(Sort.by(Sort.Direction.DESC,s));
	    }
	public List<Customer> getbypage(int pgno,int pgsize){
	   	 Page<Customer> p=cr.findAll(PageRequest.of(pgno, pgsize));
	   	 return p.getContent();
	   	 }

}
