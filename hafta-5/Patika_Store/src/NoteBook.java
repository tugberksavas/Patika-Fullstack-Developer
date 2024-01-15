import java.util.HashMap;

public class NoteBook extends ProductSpecs{

    public static HashMap<Integer, NoteBook> ourNoteBooks = new HashMap<>();

    public NoteBook(String name, int price, int discountRate, int quantity, int memory, int ram, double screenSize, Brand brandOfProduct) {
        super(name, price, discountRate, quantity, memory, ram, screenSize, brandOfProduct);
        ourNoteBooks.put(this.getId(), this);
    }
}