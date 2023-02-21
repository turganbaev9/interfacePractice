public class Guitar implements Tool{
    @Override
    public void play() {
        System.out.println("играет гитара" + "\n" + "кол. струн: " + numberOfStrings);

    }
    private int numberOfStrings;


    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
