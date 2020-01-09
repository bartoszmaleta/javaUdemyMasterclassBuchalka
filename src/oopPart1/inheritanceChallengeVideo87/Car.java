package oopPart1.inheritanceChallengeVideo87;

public class Car extends Vehicle{
    private String colour;
    private int wheels;


    public Car(int size, String colour, int wheels) {
        super(size, 1);
        this.colour = colour;
        this.wheels = wheels;
    }

    public void handSteering() {
        System.out.println("Car.handSteering() called");
    }

    public void changingGeers() {
        System.out.println("Car.changingGeers() called)");
    }

    public void drives() {
        System.out.println("Car.drives() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() called. Car is moving at " + speed);
        handSteering();
        changingGeers();
        drives();
        super.move(speed);
    }
    // public String getColour() {
    //     return colour;
    // }

    // public void setColour(String colour) {
    //     this.colour = colour;
    // }

    // public int getWheels() {
    //     return wheels;
    // }

    // public void setWheels(int wheels) {
    //     this.wheels = wheels;
    // }

    
}