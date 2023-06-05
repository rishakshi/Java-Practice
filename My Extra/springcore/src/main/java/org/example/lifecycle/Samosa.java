package org.example.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init");
    }
    public void destroy(){
        System.out.println("inside destroy");
    }
}
