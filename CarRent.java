package Pemlan;

public class CarRent {
  
    private Car car;
    private CarRider rider;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rentDur = rentDur;
        this.car = car;
        this.rider = rider;
    }

    public int getRentDur() {
        return rentDur;
    }

    public Car getCar() {
        return car;
    }

    public CarRider getRider() {
        return rider;
    }

}