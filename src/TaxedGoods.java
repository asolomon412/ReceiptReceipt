
public class TaxedGoods extends Product {

	public TaxedGoods(String name, double price) {
		super(name, price);

	}

	public TaxedGoods(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public TaxedGoods(String name, double price, boolean imported) {
		super(name, price, imported);

	}

	@Override
	public double calcTax() {
		if (isImported() == true) {
			return getPrice() * .15;
		}
		return getPrice() * .10;
	}

}
