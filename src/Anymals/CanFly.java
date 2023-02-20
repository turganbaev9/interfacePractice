package Anymals;

public interface CanFly {
void fly();

    class Duck  implements CanSwim, CanFly, CanRun {

        @Override
        public void fly() {
            System.out.println("Anymals.CanFly.Duck is flying");
        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {
            System.out.println("Anymals.CanFly.Duck is swimming");
        }
    }
}
