import java.util.ArrayList;

public class Receipt {
	
	public void printReceipt(ShoppingCart cart) {
		ArrayList<Product> myCart = cart.getProducts();
		System.out.println();
		System.out.println("Thanks for Shopping!");
		System.out.println("_____________________");
		
		for (Product p : myCart) {
			System.out.println(p);
		}
		
		System.out.println("_____________________");
		double taxAmt = addTax(myCart);
		System.out.printf("Taxes: $%.2f\n", taxAmt);
		System.out.printf("Total: $%.2f",getTotal(myCart) + taxAmt );
	}

	public double addTax(ArrayList<Product> products) {
		double tax = 0.0;
		
		for (Product p : products) {
			p.setPrice(p.getPrice() * p.getQuantity());;
			tax += p.calcTax();
		}
		return tax;
	}
	
	public double getTotal(ArrayList<Product> products) {
		double total = 0.0;

		for (Product p : products) {
			total += p.getPrice();
		}
		return total;
	}
	
	

}
