package springExample1;

public class Price {
	private long price;

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Price(long price) {
		super();
		this.price = price;
	}
	
	public Price() {
		super();
	}
}