package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }


    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car is starting...";
    }

    @Override
    public String drive() {
        return "run from GasPowered car";
    }
}
