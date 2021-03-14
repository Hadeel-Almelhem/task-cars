package com.example.demo.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameCompany;
	private String nameCar;
	private int modelYear;
	private int price;
	private int piecesNumber;
	private String imageCar;
	private String description;
	
	
	
	
	public Car() {
		
	}
	
	public Car(int id, String nameCompany, String nameCar, int modelYear, int price, int piecesNumber, String imageCar,
			String description) {
		super();
		this.id = id;
		this.nameCompany = nameCompany;
		this.nameCar = nameCar;
		this.modelYear = modelYear;
		this.price = price;
		this.piecesNumber = piecesNumber;
		this.imageCar = imageCar;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPiecesNumber() {
		return piecesNumber;
	}

	public void setPiecesNumber(int piecesNumber) {
		this.piecesNumber = piecesNumber;
	}

	public String getImageCar() {
		return imageCar;
	}

	public void setImageCar(String imageCar) {
		this.imageCar = imageCar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
