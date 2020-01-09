package oopPart1.inheritanceChallengeVideo87;

public class Car extends Vehicle {
    private int wheels;
    boolean hasFuel;

    public Car(String name, int size, String colour, int wheels, boolean hasFuel, int speed) {
        super(name, size, 1, colour, speed);
        this.wheels = wheels;
        this.hasFuel = hasFuel;
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
        if (hasFuel == true) {
            System.out.println("Car.move() called. Car is moving at " + speed);
            handSteering();
            changingGeers();
            drives();
            super.move(speed);
        }
    }
    // public String getColour() {
    // return colour;
    // }

    // public void setColour(String colour) {
    // this.colour = colour;
    // }

    // public int getWheels() {
    // return wheels;
    // }

    // public void setWheels(int wheels) {
    // this.wheels = wheels;
    // }

}