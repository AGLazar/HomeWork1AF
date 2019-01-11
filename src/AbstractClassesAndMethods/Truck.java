package AbstractClassesAndMethods;

public class Truck extends Vehicle {

    public Truck(Integer speed, Integer gear) {
        super(speed, gear);
    }

    @Override
    public void printState() {
        System.out.println("Truck state -> " + " speed: " + this.getSpeed() + " ; " + " gear " + this.getGear());
    }


}

