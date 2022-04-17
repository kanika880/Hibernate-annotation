package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_annotationway")
public class Employee { 
	
	@Id
	@Column(name ="emp_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private int empId; 
	
	@Column(name ="employee_name")
	private String empName;
	
	@Column(name ="designation")
	private String designation;
	
	public Employee() { 
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
