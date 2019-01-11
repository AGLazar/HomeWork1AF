package AbstractClassesAndMethods;

public abstract class Vehicle {
    private Integer speed;
    private Integer gear;

    public Vehicle(Integer speed, Integer gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGear() {
        return gear;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }


    public void speedUp(int increment) {

        this.speed = this.speed + increment;
    }

    public void applyBreaks(int decrement) {
        this.speed = this.speed - decrement;
    }

    public abstract void printState( ); // afiseaza starea obiectului; metoda abstracta nu are implementare. copii clasei sunt fortati sa o implementeze


}

