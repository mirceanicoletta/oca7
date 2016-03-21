package oca7;

public class Car {
	private String name;
	private Integer power;
	private String color;
	
	public Car(String _name, Integer _power, String _color) {
		this.name = _name;
		this.power = _power;
		this.color = _color;
	}	
	
	public String getName() {
		return this.name;
	}

	public Integer getPower() {
		return this.power;
	}
	
	public String getColor() {
		return this.color;
	}

	public String toString() {
		return "Car: " + getName() + ", " + getPower() + ", " + getColor();
	}
}
