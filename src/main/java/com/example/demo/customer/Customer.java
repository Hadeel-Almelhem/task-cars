package com.example.demo.customer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.car.Car;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	private int id;
	private String nameCustomer;
	private String email;
	private String phoneNumber;
	private String address; 
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "car_id",referencedColumnName = "id")
	private Car car;
	
	
	public Customer() {
		
	}
	
	public Customer(int id, String nameCustomer, String email, String phoneNumber, String address,int carId) {
		super();
		this.id = id;
		this.nameCustomer = nameCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.car=new Car(carId,"","",0,0,0,"","");		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
