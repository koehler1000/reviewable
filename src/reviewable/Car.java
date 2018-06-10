package reviewable;

public class Car {
	String brand, plate;
	
	public Car(String brand, String plate) {
		this.brand = brand;
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
}
