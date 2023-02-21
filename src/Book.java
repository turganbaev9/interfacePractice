import BooksPrintble.Printable;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book ");
        printBooks();

    }

    void printBooks() {
        Book[] books = new Book[2];
        books[0] = new Book("История Кыргызстана");
        books[1] = new Book("Великодержавие");

        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Book) {
                System.out.println(books[i].getName());


            }
        }
    }
}