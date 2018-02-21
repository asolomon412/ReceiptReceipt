import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<Product> products = new ArrayList<Product>();
	Product p;

	public ArrayList<Product> addProducts(Product p) {
		this.p = p;
		products.add(getP());
		return products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
