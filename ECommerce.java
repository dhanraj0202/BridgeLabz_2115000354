import java.util.ArrayList;
import java.util.List;

abstract class Product{
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice(double tax){
        return price + tax - calculateDiscount();
    }

    public void displayProductDetails(double tax){
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + getFinalPrice(tax));
    }

    public double getPrice(){
		return price;
	}
}

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable{
    private static final double TAX_RATE = 0.15;

    public Electronics(int productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax(){
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails(){
        return "Electronics Tax: 15%";
    }
}

class Clothing extends Product implements Taxable{
    private static final double TAX_RATE = 0.08;

    public Clothing(int productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax(){
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails(){
        return "Clothing Tax: 8%";
    }
}

class Groceries extends Product{
    public Groceries(int productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}

public class ECommerce{
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();

        Electronics laptop = new Electronics(201, "Laptop", 1000);
        Clothing tshirt = new Clothing(202, "T-Shirt", 50);
        Groceries apple = new Groceries(203, "Apple", 2);

        products.add(laptop);
        products.add(tshirt);
        products.add(apple);

        for(Product product : products){
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            product.displayProductDetails(tax);
            if(product instanceof Taxable){
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }
}
