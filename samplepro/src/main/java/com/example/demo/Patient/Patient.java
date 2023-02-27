package com.example.demo.Patient;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Patient")
public class Patient {
	@Id
    @Column(name="ID")
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="BLOODGROUP")
    private String bloodgroup;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public Patient() {}
    public Patient(int id, String name, String bloodgroup) {
		super();
		this.id = id;
		this.name = name;
		this.bloodgroup = bloodgroup;
	}
}