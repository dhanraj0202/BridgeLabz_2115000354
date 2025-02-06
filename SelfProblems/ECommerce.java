import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

class Order{
    private static int orderCounter = 1;
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(Customer customer){
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addProduct(Product product){
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: " + orderId + " - Customer: " + customer.getName());
        System.out.println("Products:");
        for(Product product : products){
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public double getTotalAmount(){
        return totalAmount;
    }
}

class Customer{
    private String name;
    private List<Order> orders;

    public Customer(String name){
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void placeOrder(Order order){
        orders.add(order);
    }

    public void viewOrders(){
        System.out.println("Customer: " + name + " - Orders:");
        for(Order order : orders){
            order.displayOrderDetails();
        }
    }
}

public class ECommerce{
    public static void main(String[] args){
        Customer customer1 = new Customer("Dhanraj");
        Customer customer2 = new Customer("Aryan");

        Product product1 = new Product("Bat", 1200);
        Product product2 = new Product("Ball", 800);
        Product product3 = new Product("Gloves", 150);

        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product3);
        customer1.placeOrder(order1);

        Order order2 = new Order(customer2);
        order2.addProduct(product2);
        customer2.placeOrder(order2);

        Order order3 = new Order(customer1);
        order3.addProduct(product3);
        customer1.placeOrder(order3);

        customer1.viewOrders();
        customer2.viewOrders();
    }
}
