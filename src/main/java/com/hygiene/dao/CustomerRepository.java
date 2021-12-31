package com.hygiene.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygiene.pojos.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByCustName(String name);

}
