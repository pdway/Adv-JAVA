package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CarDao;
import com.cdac.dto.Car;

@Service
public class CarServiceImple implements CarService {

	@Autowired
	private CarDao carDao;

	@Override
	public void addCar(Car car) {
		carDao.insertCar(car);
		
	}

	@Override
	public List<Car> selectAll() {
		return carDao.selectAll();
	}

	@Override
	public void removeCar(String carNo) {
		carDao.deleteCar(carNo);
		
	}

	@Override
	public void modifyCar(Car car) {
		
		carDao.updateCar(car);
	}

	@Override
	public Car findCar(String carNo) {
		return carDao.selectCar(carNo);
	}

	@Override
	public List<Car> oneCar(String carNo) {
		return carDao.selectoneCar(carNo);
	}

	
	
	
}
