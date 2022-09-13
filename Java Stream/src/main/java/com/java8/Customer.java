package com.java8;

import java.util.Optional;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer(1, "anil");
        System.out.println(cust1.getId()+"-"+cust1.getName());
        Customer cust2 = new Customer(2, "sunil");
        Optional<Object> c = Optional.empty();
        System.out.println(cust2.getId()+"-"+cust2.getName());
        System.out.println(c);
    }
}
