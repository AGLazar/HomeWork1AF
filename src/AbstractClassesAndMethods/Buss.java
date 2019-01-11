package AbstractClassesAndMethods;

public class Buss extends Vehicle {

    public Buss(Integer speed, Integer gear) {
        super(speed, gear);
    }


    @Override
    public void printState() {
        System.out.println("Buss state -> " + " speed: " + this.getSpeed() + " ; " + " gear " + this.getGear());
    }
}
