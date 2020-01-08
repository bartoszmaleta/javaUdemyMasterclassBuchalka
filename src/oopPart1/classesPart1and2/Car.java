package oopPart1.classesPart1and2;

public class Car {
    
    // Defined 5 fields

    // States of the car:
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("leon")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        // this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}
