
public class NonTaxedGoods extends Product {

	public NonTaxedGoods(String name, double price) {
		super(name, price);

	}

	public NonTaxedGoods(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	public NonTaxedGoods(String name, double price, boolean imported) {
		super(name, price, imported);

	}

	@Override
	public double calcTax() {
		if (isImported() == true) {
			return getPrice() * .05;
		}
		return 0;
	}

}
