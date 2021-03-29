package springExample1;

public class Bike implements Vehicle{
	private String model;
	private Price price;
	private Fuel fuelType;
	
	public Bike(String model, Price price, Fuel fuelType) {
		super();
		this.model = model;
		this.price = price;
		this.fuelType = fuelType;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Bike(String model) {
		super();
		this.model = model;
	}
	
	public Bike(String model, Fuel fuelType) {
		super();
		this.model = model;
		this.fuelType = fuelType;
	}

	public Bike() {
		super();
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void drive() {
		System.out.println("Bike Is Driving");
		System.out.println("Model is "+ model);
		System.out.println("Fuel Type is :"+ fuelType.getFuelType());
		System.out.println("Price of vehicle is :"+ price.getPrice());
	}
}