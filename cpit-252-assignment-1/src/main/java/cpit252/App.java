package cpit252;
import java.time.LocalDate;
public class App {

    public static void main(String[]args){
         /* Q1
         Product p1 = new Product(6745, 5.50, "Penne Pasta");
        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
        Product p3 = new Product(2106, 4.50, "Linguine Pasta");
        System.out.println("Total Quantity: " + p3.getTotalQuantity());*/

        Product p = new FoodProduct(1234, 9.99, "water",LocalDate.parse("2027-07-07"));
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        }
    }


       
