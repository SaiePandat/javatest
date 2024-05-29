package com.sample.Employee;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	@Lob
	@Column(name="profile_pic")
	private byte[] img;
	
	@Transient
	private String city;
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
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
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", img=" + Arrays.toString(img) + ", city=" + city
				+ ", joiningDate=" + joiningDate + "]";
	}
	public Employee(int empId, String empName, byte[] img, String city, Date joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.img = img;
		this.city = city;
		this.joiningDate = joiningDate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
