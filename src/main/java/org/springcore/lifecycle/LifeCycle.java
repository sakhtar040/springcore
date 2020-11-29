package org.springcore.lifecycle;

public class LifeCycle {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public LifeCycle() {
        super();
    }

    @Override
    public String toString() {
        return "LifeCycle{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside Init Method");
    }

    public void destroy(){
        System.out.println("Inside Destroy Method");
    }
}
