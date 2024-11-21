package com.learn.Ecommerce.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	@Id
	private String accountNumber;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false,unique = true)
	private String emailId;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String address;
	@Column(nullable=false)
	private int age;
	
}
