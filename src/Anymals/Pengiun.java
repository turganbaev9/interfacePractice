package Anymals;

import Anymals.CanFly;
import Anymals.CanRun;
import Anymals.CanSwim;

public class Pengiun implements CanRun, CanSwim, CanFly {
    @Override
    public void fly() {

    }

    @Override
    public void run() {
        System.out.println("Penguin is running");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
