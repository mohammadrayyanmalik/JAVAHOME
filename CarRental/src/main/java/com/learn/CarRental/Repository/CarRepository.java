package com.learn.CarRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.CarRental.Entity.Vehicle;

public interface CarRepository extends JpaRepository<Vehicle, Integer> {

}
