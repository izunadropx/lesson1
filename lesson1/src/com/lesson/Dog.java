package com.lesson;

public class Dog extends Animal { // stating Dog is inheriting from Animal - we can now use anything which is public from this class

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // super means to call the constructor from the class were inheriting from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() { // this overrides the eat method to the below code
        System.out.println("Dog.eat() Called");
        chew();
        super.eat(); // this will call the eat method from Animal
    }

    public void walk() {
        super.move(5); // this will tell it to use the move method from the super class (Parent)
        System.out.println("Dog.walk() called");
    }

    public void run() {
        System.out.println("Dog.run() Called");
        move(10);

    }


    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() Called");
    }

        @Override
    public void move(int speed) {
            System.out.println("Dog.move Called");
            moveLegs(speed);
            super.move(speed);
    }
}
