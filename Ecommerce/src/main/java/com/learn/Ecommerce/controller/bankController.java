package com.learn.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.BankDto;
import com.learn.Ecommerce.services.bankService;

@RequestMapping("/holderss")
@RestController
public class bankController {

	@Autowired
	bankService bankService;
	
	@PostMapping
	public ResponseEntity<BankDto> addHolder( @RequestBody BankDto bankDto)
	{
		
		BankDto savedHolder = bankService.addHolder(bankDto);
		
		return new ResponseEntity<BankDto>(savedHolder,HttpStatus.CREATED);
	}
	
	
	
	
	
}
