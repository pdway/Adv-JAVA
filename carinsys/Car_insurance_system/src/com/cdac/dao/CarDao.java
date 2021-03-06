package com.cdac.dao;
import com.cdac.dto.Car;
import java.util.List;
public interface CarDao {

	void insertCar(Car car);
	List<Car> selectAll();
	void deleteCar(String carNo);
	void updateCar(Car car);
	Car selectCar(String carNo);
	List<Car> selectoneCar(String carNo);
}
