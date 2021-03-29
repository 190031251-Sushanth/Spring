package springExample1;

public class Car implements Vehicle{
	private String model;
	private Fuel fuelType;
	private Price price;
	
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Car(String model, Fuel fuelType, Price price) {
		super();
		this.model = model;
		this.fuelType = fuelType;
		this.price = price;
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public Car(String model, Fuel fuelType) {
		super();
		this.model = model;
		this.fuelType = fuelType;
	}

	public Car(String model) {
		super();
		this.model = model;
	}
	
	public Car() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void drive() {
		System.out.println("car Is Driving");
		System.out.println("Model is "+ model);
		System.out.println("Fuel Type is "+ fuelType.getFuelType());
		System.out.println("Price of Vechicle is : "+ price.getPrice());
	}
	
}