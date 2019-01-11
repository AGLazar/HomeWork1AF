package Interfaces;

public class Main {
    public static void main(String[] args) {
        Walker walker = new Walker();
        Swimmer swimmer = new Swimmer();
        walker.breath();
        walker.walk();
        swimmer.breath();
        swimmer.swim();
    }
}
