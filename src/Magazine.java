public class Magazine  implements Printable {
    public String name;

    public Magazine(String name) {

        this.name = name;
    }

    public Magazine() {
    }

    @Override
    public void print() {
        System.out.println("this a Magazine");
printJournal();
    }


    void printJournal() {
        Magazine[] magazines = new Magazine[2];
        magazines[0] = new Magazine("Топ 10 стран для туризма");
        magazines[1] = new Magazine("Топ идеи для стартапов");

        for (int j = 0; j < magazines.length; j++) {
            System.out.println(magazines[j].name);
        }

    }
}