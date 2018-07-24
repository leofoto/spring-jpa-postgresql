package com.reactivestax.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.reactivestax.mysql.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
	List<Customer> findByFirstName(String firstName);

}
