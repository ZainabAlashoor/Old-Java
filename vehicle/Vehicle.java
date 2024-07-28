package old.vehicle;

public class Vehicle {
    public static void main(String[] args) {

        Car car1 = new Car(15000, 3);
        CheckWeight(car1); // the way to call static method

        Truck truck1 = new Truck(20000, 30000);
        CheckWeight(truck1);
    }

    public static void CheckWeight(Vehicle_Class v) {
        if (v instanceof Car) {
            if (v.CalculateWeight() > 21000) {
                System.out.println("This car is overloaded with people");
            } else {
                System.out.println("this car is not heavy");
            }
        } else if (v instanceof Truck) {
            if (v.CalculateWeight() > 45000) {
                System.out.println("this truck is too heavy!");
            } else {
                System.out.println("this truck is not heavy");
            }
        }
    }
}

class Vehicle_Class {

    private double vWeight;

    Vehicle_Class() {

    }

    Vehicle_Class(double w) {
        vWeight = w;
    }

    public double CalculateWeight() {
        return vWeight;
    }

}

class Car extends Vehicle_Class {

    private int numOfPeople;

    Car() {

    }

    Car(double w, int no) {
        super(w);
        numOfPeople = no;
    }

    @Override
    public double CalculateWeight() {

        return (super.CalculateWeight() + (numOfPeople * 70));
    }

}

class Truck extends Vehicle_Class {

    private double CargoWeight;

    Truck() {

    }

    Truck(double w, double cW) { // cW: CargoWeight
        super(w);
        CargoWeight = cW;
    }

    @Override
    public double CalculateWeight() {
        return (super.CalculateWeight() + CargoWeight);
    }
}
