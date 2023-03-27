package cpit252;
import java.time.LocalDate;

public class FoodProduct extends Product{
    private LocalDate expirationDate;

    public FoodProduct(int id, double price,int quantity ,String name, LocalDate expirationDate){
        super(id, price, quantity ,name);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString(){
        return super.toString() +"\t Expiration Date: " + this.expirationDate;
    }
}