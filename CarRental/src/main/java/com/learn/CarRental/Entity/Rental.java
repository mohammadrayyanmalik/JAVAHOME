package com.learn.CarRental.Entity;

import java.sql.Date;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Persistence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@CreationTimestamp
	private Date startDate;
	@UpdateTimestamp
	private Date EndDate;
	private double totalAmount;
	
	@ManyToOne
	private Customer customer; 
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Vehicle> vehicle;
}
