package org.example.arge;

public class ElectricCar extends CarSkeleton{
    /* CarSkeleton içerisinde default constructor olduğu için burada constructor istemedi
        public CarSkeleton() {
    }
     */

    private double avgKmPerPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerPerCharge = avgKmPerPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car is starting...";
    }

    @Override
    public String drive() {
        return "run from Electric car";
    }

    public double getAvgKmPerCharge() {
        return avgKmPerPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
