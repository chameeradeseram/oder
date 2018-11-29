package com.chameera.BookOderSys.BookOderSys;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chameera.BookOderSys.BookOderSys.Model.Customer;


@MappedTypes(Customer.class)
@MapperScan("com.chameera.BookOderSys.BookOderSys.Mapper.CustomerMapper")
@SpringBootApplication
public class BookOderSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookOderSysApplication.class, args);
	}
}
