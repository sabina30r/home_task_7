package nix.edu.data.abstr;

import org.apache.commons.math3.util.Precision;

public abstract class Planet implements CelestialObject{

    public static final double GRAVITATIONAL_CONSTANT = 6.67e-11;
    private double radius;
    private double weight;

    public Planet(double radius, double weight) {
        this.radius = radius;
        this.weight = weight;
    }

    public double getAccelerationOfGravityValue() {
        int power = 2;
        double accelerationOfGravityValue = GRAVITATIONAL_CONSTANT * ( weight / (Math.pow(radius,power)));
        double roundedAccelerationOfGravityValue = Precision.round(accelerationOfGravityValue, 2);
        return roundedAccelerationOfGravityValue;
    }
}
