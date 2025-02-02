class Product{
	String productName;
	int price;
	static int totalProducts;
	
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}

	void displayProductDetails(){
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
	
	static void displayTotalProducts(){
		System.out.println("Total Products: " + totalProducts);
	}
}
public class ProductInventory{
	public static void main(String[] args){
		Product product1 = new Product("Bat", 1500);
		Product product2 = new Product("Ball", 80);
		product1.displayProductDetails();
		product2.displayProductDetails();
		Product.displayTotalProducts();
	}
}