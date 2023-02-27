package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Patient.Patient;
import com.example.demo.Repository.Repository;

@Service
public class SServiceImpl  {
	@Autowired
	private Repository repo;
	
	public Patient adddetail(Patient obj)
	{
		return repo.save(obj);
	}
	public List<Patient> getdetail()
	{
		List<Patient> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
	public String delete(int id) {
		repo.deleteById(id);
		return "success";
	}
	public Patient update(int id,Patient obj)
	{
	 return repo.saveAndFlush(obj);	
	}
}