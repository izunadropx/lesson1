package com.lesson;

class Frog{
    private String name; //Instance variables - notice they are private meaning they can only be used by the setter method below - Encapsulation!!! ***
    private int age;//Instance variables - notice they are private meaning they can only be used by the setter method below - Encapsulation!!! ***

    public void setName(String name){ // set method setting instance variable 'name' to newName
        this.name = name ; //using this i can set name using the instance variable ***
    }

    public void setAge(int age){ // set method setting instance variable 'name' to newName
        this.age = age; //using this i can set name using the instance variable ***
    }

    public String getName(){ //get method - remember no void here as it has to return something
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setInfo (String name, int age){
        setAge(age);
        setName(name); // calling the setter method from inside another method - Notice how this isn't being used here as its used in the set method
    }
}


public class Setters {

    public static void main (String[] args) {

        Frog frog1 = new Frog();
       // frog1.name = "Bertie"; These are instance variables
        //frog1.age = 3;

        frog1.setName("Bertie"); // using the setter method 'setName' we can hide the instance variables - This is called encapsulation
        frog1.setAge(2);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge()); // calling the getter which has been used by the setter

    }
}
