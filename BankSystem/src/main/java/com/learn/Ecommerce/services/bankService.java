package com.learn.Ecommerce.services;

import java.util.List;

import com.learn.Ecommerce.Dto.BankDto;
import com.learn.Ecommerce.Entity.Bank;

public interface bankService {

	// to add account holder
	BankDto addHolder(BankDto bankDto);
	
	// to fetch all holder
	List<BankDto> getallAccountHolderDto();
	
	//to fetch holder by id
	BankDto getHolderById(String id);
	
	
	// update holder by id
	BankDto updateHolderById(String id,BankDto bankDto);
	
	
	// delete holder by id
	String deleteHolder(String id);
	
	// entity to dto conversion
	BankDto entityToDto(Bank bank);
	
	// dto to entity
	Bank DtoToEntity(BankDto bankDto);
	
}
