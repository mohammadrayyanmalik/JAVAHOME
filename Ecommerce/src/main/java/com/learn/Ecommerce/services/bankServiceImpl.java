package com.learn.Ecommerce.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Ecommerce.Dto.BankDto;
import com.learn.Ecommerce.Entity.Bank;
import com.learn.Ecommerce.repository.BankRepository;

@Service
public class bankServiceImpl implements bankService {

	@Autowired
	BankRepository bankRepository;
	
	@Override
	public BankDto addHolder(BankDto bankDto) {

		UUID randomUUID = UUID.randomUUID();
		String id = randomUUID.toString();
		bankDto.setAccountNumber(id);
		
		Bank bank = DtoToEntity(bankDto);
		Bank savedBank=bankRepository.save(bank);
		
		BankDto savedDto = entityToDto(savedBank);
		return savedDto;
	}

	@Override
	public List<BankDto> getallAccountHolderDto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDto getHolderById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDto updateHolderById(String id, BankDto bankDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteHolder(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDto entityToDto(Bank bank) {
		BankDto bankDto = new BankDto();
		
		bankDto.setAccountNumber(bank.getAccountNumber());
		bankDto.setFirstName(bank.getFirstName());
		bankDto.setLastName(bank.getLastName());
		bankDto.setEmailId(bank.getEmailId());
		bankDto.setPassword(bank.getPassword());
		bankDto.setAddress(bank.getAddress());
		bankDto.setAge(bank.getAge());
		
		
		return bankDto;
	}

	@Override
	public Bank DtoToEntity(BankDto bankDto) {
		
		Bank bank = new Bank();
		
		bank.setAccountNumber(bankDto.getAccountNumber());
		bank.setFirstName(bankDto.getFirstName());
		bank.setLastName(bankDto.getLastName());
		bank.setEmailId(bankDto.getEmailId());
		bank.setPassword(bankDto.getPassword());
		bank.setAddress(bankDto.getAddress());
		bank.setAge(bankDto.getAge());
		return bank;
	}

	
	
	


	

	

	
	
}
