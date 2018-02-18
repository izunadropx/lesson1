package com.lesson;

class Robot {
    public void speak(String text) { // declaring a parameter which can be passed   - Param is a var which is passed into a method
        System.out.println(text); // here we are calling the parameter
    }

    public void jump(int height){
        System.out.println("Jumping: " + height + " Meters");
    }

    public void move(String direction, double distance){ // declaring multiple params - can be any type
        System.out.println("Moving " + distance + " meters, in direction " + direction);
    }

}

public class Method_Params {

    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.speak("Hi I'm Sam!"); // this is where the value of the param is passed from
        sam.jump(25);
        sam.move("West", 56.3); // using multiple parameters and passing values to it

        String greeting = "Hello"; // You can change what the parameter is using for its value in the main part of the code

        sam.speak(greeting); // here i am calling the other parameter
    }
}
