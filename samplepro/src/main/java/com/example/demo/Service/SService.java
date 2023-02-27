package com.example.demo.Service;

import java.util.List;

import com.example.demo.Patient.Patient;

public interface SService {
	public Patient adddetail(Patient obj);
	public List<Patient> getdetail();
	public String delete(int id);
	public Patient update(int id,Patient obj);
}
