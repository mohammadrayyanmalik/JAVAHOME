package com.learn.CarRental.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

	private Date startDate;
	private Date EndDate;
	private double totalAmount;
}
