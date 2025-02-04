class Product{
	static int discount = 15;
	private String productName;
	private double price;
	private int quantity;
	final int productID;
	
	Product(String productName, double price, int quantity, int productID){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	static void updateDiscount(int newDiscount){
		discount = newDiscount;
		System.out.println("Updated Discount: " + discount + "%");
	}
	
	void displayProductDetails(){
		if(this instanceof Product){
			System.out.println("Product Name: " + productName);
			System.out.println("Price: " + price);
			System.out.println("Quantity: " + quantity);
			System.out.println("Product ID: " + productID);
			System.out.println("Discount: " + discount + "%");
		}
	}
}

public class ShoppingCartSystem{
	public static void main(String[] args){
		Product product1 = new Product("Bat", 1500, 15, 111);
		product1.displayProductDetails();
		Product.updateDiscount(25);
	}
}