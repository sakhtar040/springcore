package org.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter");
        this.address = address;
    }

    public Employee() {
        super();
    }

    @Autowired
    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("Constructor");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
