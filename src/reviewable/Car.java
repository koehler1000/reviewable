package reviewable;

public class Car {
	String brand, plate;
	int speed;
	
	public Car(String brand, String plate, int speed) {
		this.brand = brand;
		this.plate = plate;
		this.speed = speed;
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
