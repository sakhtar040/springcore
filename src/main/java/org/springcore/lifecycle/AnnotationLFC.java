package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLFC {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public AnnotationLFC() {
        super();
    }

    @Override
    public String toString() {
        return "AnnotationLFC{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Start Annotation---");
    }

    @PreDestroy
    public void end(){
        System.out.println("End Annotation----");
    }
}
