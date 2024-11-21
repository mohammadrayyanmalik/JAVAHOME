package com.learn.Ecommerce.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {


	private String accountNumber;
	private String confirmAccountNumber;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String confirmPassword;
	private String address;
	private int age;
	
}
