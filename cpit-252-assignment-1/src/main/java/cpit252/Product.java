package cpit252;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int count;
    private int quantity;

    protected double wight;

    protected double getWight() {
        return wight;
    }

    protected void setWight(double wight) {
        this.wight = wight;
    }

    public Product(int id, double price, int count, String name){
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return this.quantity;
    }

    public void getSellableStatus(){
        System.out.println("This product is sellable");
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}