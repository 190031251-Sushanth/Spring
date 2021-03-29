package springExample1;

public class Fuel {
	private String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Fuel(String fuelType) {
		super();
		this.fuelType = fuelType;
	}
	
	public Fuel() {
		super();
	}
}