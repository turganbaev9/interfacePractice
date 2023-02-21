public class trump implements Tool{
    @Override
    public void play() {
        System.out.println("Трубач играет");
    }
    private int diameter;

    public trump(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
