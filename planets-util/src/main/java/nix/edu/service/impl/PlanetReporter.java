package nix.edu.service.impl;

import nix.edu.data.abstr.Planet;
import nix.edu.service.Reporter;

public class PlanetReporter implements Reporter<Planet> {
    @Override
    public void showAccelerationOfGravityValue(Planet planet) {
        System.out.println("I'm " + planet.getClass().getSimpleName()
                + " and my acceleration of gravity = " + planet.getAccelerationOfGravityValue());
    }
}
