package com.example.demo.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	public List<Car> listAll() {
		return (List<Car>) carRepository.findAll();
	}

	public void save(List<Car> car) {
		carRepository.saveAll(car);
		
	}

	public Object listCarById(int id) {
		// TODO Auto-generated method stub
		return carRepository.findById(id);
	}

	public void updateCar(int id, Car car) {
		carRepository.save(car);		
	}

	public void deleteCar(int id) {
		carRepository.deleteById(id);		
	}

}
