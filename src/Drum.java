public class Drum implements Tool{

    @Override
    public void play() {
        System.out.println("Барабан барабанится");
    }
    private int size;


    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
