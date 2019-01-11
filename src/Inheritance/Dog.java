package Inheritance;

public class Dog extends Animal {
    private String color;
    public Dog(Integer age, Integer numberOfLegs, Boolean isVegetarian, String color) {
        super(age, numberOfLegs, isVegetarian);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String bark(){
        String barking = "Whof Whof";
        return barking;
    }

    @Override
    public  String toString(){
        return super.toString() + " the color is " + color;
    }
}
