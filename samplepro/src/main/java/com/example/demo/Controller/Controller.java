package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Patient.Patient;
import com.example.demo.Service.SServiceImpl;

@RestController
public class Controller {
	@Autowired
	private SServiceImpl Sserve;
	@PostMapping("/add")
	public Patient postdetails(@RequestBody Patient obj)
	{
		return Sserve.adddetail(obj);
	}
	@GetMapping("/show")
	public List<Patient> showdetail()
	{
		List<Patient> a = new ArrayList<>();
		a = Sserve.getdetail();
		return a;
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		Sserve.delete(id);
		return "success";
	}
	@PutMapping("/update/{id}")
	public Patient update(@PathVariable int id,@RequestBody Patient obj){
		return Sserve.update(id, obj);
	}
}
