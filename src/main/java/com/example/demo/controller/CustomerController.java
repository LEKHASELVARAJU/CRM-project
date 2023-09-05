package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerController {
	@Autowired 
	CustomerService cs;
	@PostMapping("/")
	public Customer post(@RequestBody Customer c)
	{
		return cs.posting(c);
	}
	
	@GetMapping("/")
	public List<Customer> showdetail()
	{
		return cs.getinfo();
	}
//	@GetMapping("/id/{id}")
//	public Optional<Customer> showbyid(@PathVariable int id)
//	{
//		return cs.getinfoid(id);
//	}
	
	@PutMapping("/id/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Customer ss) {
		return cs.updateinfoid(id, ss);
	}
	@DeleteMapping("/del/{id}")
	public String delete(@PathVariable(value = "id") int id)
	{
		try {
			cs.del(id);
			return "deleted!";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "No";
		}
	}
	@GetMapping("sort/{name}")
	 public List<Customer> getsortinfo(@PathVariable String name){
	 return cs.sortinfo(name);
	 }
	
	@GetMapping("paging/{pageno}/{pagesize}")
	 public List<Customer> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize){
		 return cs.getbypage(pageno, pagesize);
	 }
	@GetMapping("get/{id}")
	public Optional<Customer> gett(@PathVariable int id)
	{
		return cs.getId(id);
	}
	@GetMapping("sort")
	public List<Customer> sortt()
	{
		return cs.sort();
	}
	@GetMapping("page")
	public List<Customer> pagesort()
	{
		return cs.getbypage1();
	}
}
