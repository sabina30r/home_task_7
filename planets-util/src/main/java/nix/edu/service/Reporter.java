package nix.edu.service;

import nix.edu.data.abstr.CelestialObject;

public interface Reporter<T extends CelestialObject> {

    void showAccelerationOfGravityValue(T t);
}
