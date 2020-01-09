package oopPart1.inheritanceChallengeVideo87;

public class Vehicle {
    private String name;
    private int size;
    private int engine;
    private String colour;

    public Vehicle(String name, int size, int engine, String colour) {
        this.name = name;
        this.size = size;
        this.engine = engine;
        this.colour = colour;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Vehicle is moving at " + speed);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}