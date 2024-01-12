import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", 4046, "J.K Rowling", "1997");
        Book book2 = new Book("Game Of Thrones", 5264, "George R.R. Martin", "1996");
        Book book3 = new Book("Ring", 890, "Tolkien", "1953");
        Book book4 = new Book("Star Wars", 234, "George Lucas", "1970");
        Book book5 = new Book("Bülbülü Öldürmek", 350, "Harper Lee", "1960");

        // Kitapları isme göre sıralayan set
        Set<Book> nameSorting = new TreeSet<>();
        nameSorting.add(book1);
        nameSorting.add(book2);
        nameSorting.add(book3);
        nameSorting.add(book4);
        nameSorting.add(book5);

        System.out.println("----KİTAP ADINA GÖRE SIRALAMA-----");
        for (Book book : nameSorting) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralamak için karşılaştırıcı
        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getSayfaSayisi);

        // Kitapları sayfa sayısına göre sıralayan set
        Set<Book> pageCountSorting = new TreeSet<>(pageCountComparator);
        pageCountSorting.addAll(nameSorting);

        System.out.println("\n----SAYFA SAYISINA GÖRE SIRALAMA-----");
        for (Book book : pageCountSorting) {
            System.out.println(book);
        }


    }
}