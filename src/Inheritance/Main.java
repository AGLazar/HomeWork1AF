package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(3,4, true);
        System.out.println("The animal's age is " + animal1.getAge());
        System.out.println("The animal's number of legs is " + animal1.getNumberOfLegs());
        System.out.println("The animal is vegeterian? ->" + animal1.getVegetarian());

        Dog dog1 = new Dog(4,4,false,"brown");
        Animal dog2 = new Dog(3,4,false,"black");
        System.out.println("The " +  dog1.getColor() + " dog is " + dog1.getAge() + "years old.");
        System.out.println("The " + ((Dog) dog2).getColor() + " dog is barking. Listen --> " + ((Dog) dog2).bark());
        System.out.println("The " + dog1.getColor() + " one hears it. It " + dog1.bark() + " as well!");

        Animal dog3 = new Dog(5,4, true,"white");
        Animal animal2 = new Animal(150,4,true);
        System.out.println(dog3.toString());
        System.out.println(animal2.toString());

    }
}
