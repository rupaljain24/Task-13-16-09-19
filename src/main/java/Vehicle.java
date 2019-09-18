import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Vehicle {
@Id
	private int regNo;
private String brand;
private String model;
private int price;

public int getRegNo() {
	return regNo;
}
public void setRegNo(int regNo) {
	this.regNo = regNo;
}
public String getBrand() {
	return brand;
}
public Vehicle(int regNo, String brand, String model, int price) {
	super();
	this.regNo = regNo;
	this.brand = brand;
	this.model = model;
	this.price = price;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
@Override
public String toString() {
	return "Vehicle [regNo=" + regNo + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Vehicle() {
	super();
}

public Vehicle(int regNo) {
	super();
	this.regNo = regNo;
}





















}
