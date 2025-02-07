class Order{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus(){
        System.out.println("Status: Order placed");
    }
}

class ShippedOrder extends Order{
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus(){
        System.out.println("Status: Order Shipped");
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus(){
        System.out.println("Status: Order Delivered");
    }
}

public class OnlineRetail{
    public static void main(String[] args){
        Order order1 = new Order(101, "2025-02-01");
        ShippedOrder order2 = new ShippedOrder(102, "2025-02-02", "TRK12345");
        DeliveredOrder order3 = new DeliveredOrder(103, "2025-02-03", "TRK67890", "2025-02-05");

        order1.getOrderStatus();
        System.out.println();
        order2.getOrderStatus();
        System.out.println();
        order3.getOrderStatus();
    }
}
