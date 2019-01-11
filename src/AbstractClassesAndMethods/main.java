package AbstractClassesAndMethods;

public class main {
    public static void main(String[] args) {
        Truck truck = new Truck(1,5);
        truck.printState();
        truck.changeGear(3);
        truck.speedUp(30);
        truck.applyBreaks(25);
        truck.printState();

        Buss buss = new Buss(10,6);
        buss.printState();
        buss.changeGear(5);
        buss.speedUp(160);
        buss.applyBreaks(60);
        buss.printState();
    }
}
