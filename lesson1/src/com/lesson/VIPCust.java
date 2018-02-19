package com.lesson;

public class VIPCust {
    private String name;
    private double creditLimit;
    private String email;

    public VIPCust(String name, double creditLimit, String email) { // this is a complete constructor with all values assigned when the class is initialised in main
        System.out.println("3rd Constructor being called!");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIPCust(String name, String email) {
        this(email, 10000, name);
        System.out.println(" 2nd constructor being called"); // this constructor already has some information being passed to it - email & name
        System.out.println(name + "Your limit is: " + creditLimit + "Email: " + email);
    }

    public VIPCust() {
        this("Default Name", 20000, "paul@paul.com");
        System.out.println("Empty Constructor being called!"); // this constructor is empty so we assign values as above when nothing is specified when the class is initialised
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
