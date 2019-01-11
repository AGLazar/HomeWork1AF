package Interfaces;

public class Walker implements Walk, Breath{



    @Override
    public void breath() {
        System.out.println(" breath in and out ");
    }

    @Override
    public void walk() {
        System.out.println(" First step, second step ....walking");

    }
}
