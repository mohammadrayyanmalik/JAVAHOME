package com.learn.CarRental.Entity;

import java.awt.geom.GeneralPath;
import java.util.List;

import org.hibernate.engine.internal.Cascade;
import org.hibernate.engine.internal.CascadePoint;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customersId;
	
	private String FirstName;
	private String LastName;
	private long contactNo;
	private String Email;
	private String LicenceNo;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "customer")
	private List<Rental> rental;
	
	
	
	
	
}
