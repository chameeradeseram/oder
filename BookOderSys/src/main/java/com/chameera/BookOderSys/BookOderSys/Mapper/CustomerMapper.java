package com.chameera.BookOderSys.BookOderSys.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.chameera.BookOderSys.BookOderSys.Model.Customer;

@Mapper
public interface CustomerMapper {

	@Select("select * from customer")
	List<Customer> findAll();
	
      @Insert("INSERT INTO customer(customer_name, password, email) VALUES(#{customer_name},#{password},#{email})")
	
	void insertCustmer(Customer customer);
}
