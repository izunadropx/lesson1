public class Vehicle{


    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.size = size;
        this.name = name;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
    this.currentDirection += direction;
        System.out.println("Vehicle.steer() Steering at " + currentDirection + "Degrees");
    }

    public void move(int velocity, int direction){
        this.currentVelocity += velocity;
        this.currentDirection += direction;
        System.out.println("Vehicle.move() Moving at " + currentVelocity + " speed, and " + currentDirection + " Degrees");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity = 0;
        System.out.println("You have stopped moving!");
    }
}