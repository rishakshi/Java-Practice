package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Pepsi(double price) {
        this.price = price;
    }
    public Pepsi() {
        super();
    }
    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //INIT
        System.out.println("Taking pepsi");
    }

    @Override
    public void destroy() throws Exception {
        //DESTROY
        System.out.println("Giving pepsi");
    }
}
