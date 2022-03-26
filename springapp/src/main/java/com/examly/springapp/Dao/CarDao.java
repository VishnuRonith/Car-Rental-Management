package com.examly.springapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.Entity.Cars;

public interface CarDao extends JpaRepository<Cars, String> {
    
}
