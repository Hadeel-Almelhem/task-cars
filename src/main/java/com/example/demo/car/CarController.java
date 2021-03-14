package com.example.demo.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@RequestMapping(value= "/hello")	
	public String greet() {
		return "hello world";
	}
	
	@Autowired
	private CarService carService;

	
	//add car in database
	@PostMapping("/addCar")
	public void addCars(@RequestBody List<Car> car) {
		carService.save(car);
	}
	
	
	//get all cars in database
	@GetMapping("/getCars")
	public List<Car> getCars(){
		return carService.listAll();
	}
	
	
	//get car for specific id 
	@GetMapping("/getCar/{id}")
	public Object getCarById(@PathVariable int id) {
		return carService.listCarById(id);
	}
	
	
	//update car for specific id
	@RequestMapping(method=RequestMethod.PUT,value="/updateCar/{id}")
	public void updateCar(@RequestBody Car car,@PathVariable int id) {
		carService.updateCar(id,car);
	}
	
	//delete car for specific id
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteCar/{id}")
	public void deleteCar(@PathVariable int id) {
		carService.deleteCar(id);	
	}
	

}
