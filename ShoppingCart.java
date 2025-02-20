import java.util.*;

public class ShoppingCart{
	private Map<String, Double> productPrices = new HashMap<>();
	private LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();

	public void addProduct(String product, double price){
		productPrices.put(product, price);
		cartOrder.put(product, price);
	}

	public void displaySortedByPrice(){
		TreeMap<String, Double> sortedByPrice = new TreeMap<>(Comparator.comparing(productPrices::get));
		sortedByPrice.putAll(productPrices);
		System.out.println("Products Sorted by Price: " + sortedByPrice);
	}

	public static void main(String[] args){
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("Laptop", 1200.00);
		cart.addProduct("Mouse", 25.00);
		cart.addProduct("Keyboard", 45.00);
		cart.addProduct("Monitor", 300.00);

		cart.displaySortedByPrice();
	}
}