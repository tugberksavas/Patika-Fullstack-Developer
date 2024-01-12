public class Book implements Comparable<Book> {
    private String kitapAdi;
    private int sayfaSayisi;
    private String yazarAdi;
    private String yayinciAdi;

    public Book(String kitapAdi, int sayfaSayisi, String yazarAdi, String yayinciAdi) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarAdi = yazarAdi;
        this.yayinciAdi = yayinciAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYayinciAdi() {
        return yayinciAdi;
    }

    public void setYayinciAdi(String yayinciAdi) {
        this.yayinciAdi = yayinciAdi;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.kitapAdi.compareTo(otherBook.kitapAdi);
    }

    @Override
    public String toString() {
        return "Book Name : " + this.kitapAdi+
                "Page Count : " + this.sayfaSayisi+
                "Author : " + this.yazarAdi+
                "Publication Date : " + this.yayinciAdi;
    }
}
