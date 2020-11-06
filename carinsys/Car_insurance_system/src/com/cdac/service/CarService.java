package com.cdac.service;
import com.cdac.dto.Car;
import java.util.List;


public interface CarService {

	void addCar(Car car);
	List<Car> selectAll();
	void removeCar(String carNo);
	void modifyCar(Car car);
	Car findCar(String carNo);
	List<Car> oneCar(String carNo);
}
