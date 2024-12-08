package com.learn.CarRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.CarRental.Entity.Rental;

public interface RentalRepository extends JpaRepository<Rental	, Integer>{

}
