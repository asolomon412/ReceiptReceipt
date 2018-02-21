import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Product> prodList = new ArrayList<>();
		prodList.add(new NonTaxedGoods("Rice", 2.99, false));
		prodList.add(new NonTaxedGoods("Milk", 2.99, false));
		prodList.add(new NonTaxedGoods("Bread", 1.99, false));
		prodList.add(new TaxedGoods("Generic Goods", 3.99, false));
		prodList.add(new TaxedGoods("Imported Wine", 24.99, true));
		prodList.add(new TaxedGoods("Imported Chocolate", 5.99, true));
		Receipt receipt = new Receipt();
		ShoppingCart cart = new ShoppingCart();

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			int itemNum = 1;
			for (Product p : prodList) {
				System.out.println(itemNum++ + ". " + p);
			}

			System.out.println();
			int getItem = Validator.getInt(scan, "Please select an item: ", 1, itemNum-1);

			int quantity = Validator.getInt(scan, "How many do you want to add? ");

			if (prodList.get(getItem - 1) instanceof TaxedGoods) {

				// I did this to make sure that the cart had it's own copy of the object
				// otherwise the cart was maintaining the added items and printing the quantity 
				TaxedGoods tg = new TaxedGoods(prodList.get(getItem - 1).getName(),
						prodList.get(getItem - 1).getPrice(), prodList.get(getItem - 1).isImported());
				tg.setQuantity(quantity);
				cart.addProducts(tg);
			} else {

				NonTaxedGoods ntg = new NonTaxedGoods(prodList.get(getItem - 1).getName(),
						prodList.get(getItem - 1).getPrice(), prodList.get(getItem - 1).isImported());
				ntg.setQuantity(quantity);
				cart.addProducts(ntg);
			}

			System.out.println();
			cont = Validator.getString(scan, "Add more items? ");
		}
		receipt.printReceipt(cart);
	}

}
