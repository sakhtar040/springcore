package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceLFC implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InterfaceLFC() {
        super();
    }

    @Override
    public String toString() {
        return "InterfaceLFC{" +
                "price=" + price +
                '}';
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize---");
    }
}
