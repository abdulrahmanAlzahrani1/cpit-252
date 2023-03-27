package cpit252;

import java.util.Arrays;

public class Order {
    private int id;
    private String status = "created";
    private double orderPrice;
    private Product [] products;
    public Order(Product [] products, int id, String status){
        double totalPrice =0;
        for (Product p:
             products) {
            this.id = id;
            this.status = status;
            totalPrice += p.getTotalQuantity() * p.getPrice();
        }
        this.orderPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderPrice=" + orderPrice +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
