package com.lesson;

class Person {

    //Instance Variables (data or "state")
    String name;
    int age;

    //Classes contain

    //1. Data
    //2. Subroutines (methods)
    void speak() {
        for (int i = 0; i < 3; i++) { //using a for loop within a method
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old."); //defining the method - anything can be included here
        }
    }

    void sayHello() {
        System.out.println("Hello there!");

    }
}
    class Car {

        String Manufacturer; //This is all the information (data) that can be assigned to the object created using this class
        double price;
        String Model;
        String Colour;
        int Seats;
    }


    public class Classes { //if this is public it must match the name of the file
        //Classes are a blueprint for making objects (contains information and variables to declare/assign)

        public static void main(String[] args) {

            Person Person1 = new Person(); //using class Person to create a new Person Object
            Person1.age = 32; //giving the properties a value
            Person1.name = "Joe Bloggs";// giving the name property a value
            Person1.speak();
            Person1.speak();
            Person1.sayHello();
            Person1.sayHello();

            Person Person2 = new Person();
            Person2.age = 30;
            Person2.name = "Jane Doe";
            Person2.speak(); //Method being called - It can be called as many times as it likes
            Person2.speak();

            Car Ford = new Car();
            Ford.Colour = "Red";
            Ford.Manufacturer = "Ford";
            Ford.Model = "Fiesta";
            Ford.price = 29.999;
            Ford.Seats = 4;

            System.out.println(Ford.Model);


        }

    }

