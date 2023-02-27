package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Patient.Patient;

public interface Repository extends JpaRepository<Patient,Integer> {

}
