package dependencyinversion;
public class BookService {
    private NumericGenerator numericGenerator;

    public BookService(NumericGenerator numericGenerator) {
        this.numericGenerator = numericGenerator;
    }

    public Book createBook(String title) {
        return new Book(title, numericGenerator.generateNumber());
    }
}
