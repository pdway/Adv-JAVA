package com.cdac.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carv")
public class Car {

	@Id
	@Column(name = "Car_no")
	private String carNo;
	@Column(name = "Source")
	private String Source;
	@Column(name = "Category")
	private String Category;
	@Column(name = "Manufacturer")
	private String Manufacturer;
	@Column(name = "Colour")
	private String Colour;
	@Column(name = "Owner_name")
	private String ownerName;
	@Column(name = "Lic_no")
	private int licNo;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String carNo) {
		super();
		this.carNo = carNo;
	}
	
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getLicNo() {
		return licNo;
	}
	public void setLicNo(int licNo) {
		this.licNo = licNo;
	}
	
	
	
	
	
	
	
}
