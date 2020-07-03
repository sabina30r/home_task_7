package nix.edu;

import nix.edu.data.*;
import nix.edu.data.abstr.Planet;
import nix.edu.service.impl.PlanetReporter;

import java.util.ArrayList;
import java.util.List;

public class PlanetsApp {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();
        PlanetReporter planetReporter = new PlanetReporter();

        planets.add(new Mercury(2.44e6, 3.33e23));
        planets.add(new Venus(6.05e6, 4.87e24));
        planets.add(new Earth(6.37e6, 5.97e24));
        planets.add(new Mars(3.39e6, 6.41e23));
        planets.add(new Jupiter(6.99e7, 1.89e27));
        planets.add(new Saturn(5.73e7, 5.68e26));
        planets.add(new Uranus(2.53e7, 8.68e25));
        planets.add(new Neptune(2.45e7, 1.02e26));

        for(Planet planet : planets){
           planetReporter.showAccelerationOfGravityValue(planet);
        }
    }
}
