package cpit252;
public class ElectricProduct extends Product{

    private String voltage;

    public ElectricProduct(int id, double price,int quantity ,String name, String voltage){
        super(id, price, quantity,name);
        this.voltage = voltage;
    }

    @Override
    public String toString(){
        return super.toString() +"\t Voltage: " + this.voltage;
    }

}