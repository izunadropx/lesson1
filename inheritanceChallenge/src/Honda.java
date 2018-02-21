public class Honda extends Car {
    private int roadServiceMonths;

    public Honda(int roadServiceMonths) {
        super("Honda", "4WD", 4, 3, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }



    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0 ){
            stop();
        }
        else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
            System.out.println("Gear changed to " + getCurrentGear());
        }
        else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
            System.out.println("Gear changed to " + getCurrentGear());
        }
        else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
            System.out.println("Gear changed to " + getCurrentGear());
        }
        else if(newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
            System.out.println("Gear changed to " + getCurrentGear());
        }
        else if(newVelocity > 40 && newVelocity <= 50){
            changeGear(5);
            System.out.println("Gear changed to " + getCurrentGear());
        }
        if (newVelocity > 0 ){
            changeVelocity(newVelocity,getCurrentDirection());
        }


    }
}
