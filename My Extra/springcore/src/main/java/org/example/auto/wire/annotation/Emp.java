package org.example.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//    By Type
    @Autowired
    @Qualifier("address2")
    private Address address;

//    By constructor
//    @Autowired
    public Emp(Address address) {
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Address getAddress() {
        return address;
    }

//    By name
//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
