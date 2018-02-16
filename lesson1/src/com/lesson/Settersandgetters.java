package com.lesson;

class Persona {
    String name; //** - remember these are just references not the object itself
    int age; //** These DO NOT include the result of methods

    void speak() {
        System.out.println("Hello, my name is: " + name);
    }

    int calculateYearsToRetirement() { // this is a method which will return and store a value - notice how it is int and not void
        int yearsLeft = 65 - age;

        System.out.println(yearsLeft);
        return yearsLeft; // must contain a return statement at the end as it is not void
    }

    int getAge() { //creating a method to get the age of Peronsa - This is known as a get method
        return age; //getting age from the top **
    }

    String getName(){ //creating a method to get the name of Peronsa object - This is known as a get method
        return name; // getting name from the top **
    }
 }


public class Settersandgetters {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.name = "Bob";
        persona1.age = 32;
        int years = persona1.calculateYearsToRetirement(); //settings years to the return value of the method calculateYearsToRetirement ***
        int age = persona1.getAge();//***
        String name = persona1.getName();//***


        System.out.println("Hi, my name is: " + name); //using name from here ***
        System.out.println("I am " + age + " years old!"); //using age from here ***
        System.out.println("I can retire in " + years + " years");//using years from here ***
    }
}
