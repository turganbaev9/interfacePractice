package Anymals;

public class Main {
    public static void main(String[] args) {
Toad toad =new Toad("ew");
CanFly.Duck duck =new CanFly.Duck();
Pengiun pengiun=new Pengiun();
toad.run();
    toad.swim();

    }

    public static class Toad implements CanFly, CanRun, CanSwim {
        public String name;

        public Toad(String name) {
            this.name = name;
        }

        @Override
        public void fly() {

        }

        @Override
        public void run() {
            System.out.println("Anymals.Main.Anymals.Main.Toad is running");
        }

        @Override
        public void swim() {
            System.out.println("Anymals.Main.Anymals.Main.Toad is swimming");
        }
    }
}
