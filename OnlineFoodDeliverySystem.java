import java.util.ArrayList;
import java.util.List;

abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }

    public double getPrice(){
		return price;
	}
	
    public int getQuantity(){
		return quantity;
	}
}

interface Discountable{
    void applyDiscount(double discountPercentage);
    double getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable{
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return (getPrice() * getQuantity()) - getDiscountDetails();
    }

    @Override
    public void applyDiscount(double discountPercentage){
        discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public double getDiscountDetails(){
        return discount;
    }
}

class NonVegItem extends FoodItem implements Discountable{
    private static final double NON_VEG_EXTRA_CHARGE = 2.50;
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return (getPrice() * getQuantity() + (NON_VEG_EXTRA_CHARGE * getQuantity())) - getDiscountDetails();
    }

    @Override
    public void applyDiscount(double discountPercentage){
        discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public double getDiscountDetails(){
        return discount;
    }
}

public class OnlineFoodDeliverySystem{
    public static void main(String[] args){
        List<FoodItem> order = new ArrayList<>();

        VegItem burger = new VegItem("Burger", 5.99, 2);
        NonVegItem chicken = new NonVegItem("Chicken", 8.99, 3);

        order.add(burger);
        order.add(chicken);

        for(FoodItem item : order){
            item.getItemDetails();
            System.out.println();
        }

        burger.applyDiscount(10);
        chicken.applyDiscount(5);

        System.out.println("Final Order Details After Discount:");
        for(FoodItem item : order){
            item.getItemDetails();
            System.out.println();
        }
    }
}