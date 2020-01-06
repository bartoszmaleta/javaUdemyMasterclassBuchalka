package app;

public class AreaCalculator {
    public static void main(String[] args) {

    }

    public static double area (double radius) {
        if (radius < 0) {
            double valueError = -1.0;
            return valueError; 
        }
        double areaOfCircle = Math.PI * (radius *radius);

        return areaOfCircle;
    }

    public static double area (double x, double y) {
        if ((x < 0) || (y < 0)) {
            double valueError = -1.0;
            return valueError;
        }
        
        double areaOfRectangle = x * y;
        return areaOfRectangle;
    }
    
}