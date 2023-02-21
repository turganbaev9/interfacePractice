public class TestTools {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(3);
        trump trump = new trump(15);
        Tool[] tool = {drum, trump, guitar};
        for (Tool item : tool) {
          item.play();
        }

    }

}
