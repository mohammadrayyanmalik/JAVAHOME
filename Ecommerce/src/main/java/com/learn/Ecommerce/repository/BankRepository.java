package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, String>{

	
	
}
