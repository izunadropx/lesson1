package com.lesson;

class Machine{

    private String name;
    private int code;


    public Machine() {  //Constructor - This must match the name of the class - This will call the 3rd constructor when it is called then any other code within - 'this' is what calls the constructor
        this("Arnie", 0); // as this is in the constructor it will be set as the class is initialised - Doing 'this' calls any of the constructor which meets the parameters - IT MUST BE FIRST
        System.out.println("Constructor Running!"); // This will run every time the class is initialised or a new instance is created

    }

    public Machine (String name){ // This is the 2nd constructor - Notice it has the same name but declares it takes a string
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine (String name, int code) {
        this("Arnie"); // this is calling constructor 2 at the start of the constructor (3)
        System.out.println("Constructor 3 running!");
        this.name = name;
        this.code = code;

    }

}

public class Constructors {

    public static void main (String[] args){
        Machine machine1 = new Machine();
        new Machine(); // new is what calls the constructor

        Machine machine2 = new Machine("Bertie"); // Using the second constructor passing a string in - This is how it knows which to use

        Machine machine3  = new Machine("David", 7); // Using constructor 3 - Java knows which to use as it takes 2 params - Clever Java!!!


    }
}
