package com.chameera.BookOderSys.BookOderSys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chameera.BookOderSys.BookOderSys.Mapper.CustomerMapper;
import com.chameera.BookOderSys.BookOderSys.Model.Customer;

@RestController
@RequestMapping("/app/customer")
public class CustomerController {
    
	@Autowired
	private CustomerMapper CustomerMapper;
	
	
	@GetMapping("/all")
	public List<Customer> getAll(){
		return CustomerMapper.findAll();
		
	}
	
}
