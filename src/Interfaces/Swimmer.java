package Interfaces;

public class Swimmer implements Swim, Breath {
    @Override
    public void breath() {
        System.out.println(" breath in (and some water) breath out (and some water)");
    }

    @Override
    public void swim() {
        System.out.println("Swimming like a fish");
    }
}
