
public abstract class Product {
	private String name;
	private double price;
	private int quantity;
	private boolean imported;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price, boolean imported) {
		super();
		this.name = name;
		this.price = price;
		// this.quantity = quantity;
		setImported(imported);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public abstract double calcTax();

	public String toString() {
		if (getQuantity() > 1) {
			return String.format("%s $%.2f (%s @ $%.2f)", getName(), (getPrice() * getQuantity()), getQuantity(),
					getPrice());
		}
		return String.format("%s $%.2f", getName(), getPrice());
	}
}
