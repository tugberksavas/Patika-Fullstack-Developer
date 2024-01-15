import java.util.HashMap;
import java.util.Scanner;

public class NotebookServices {

    Scanner scan = new Scanner(System.in);

    public void run(HashMap<Integer, NoteBook> notebookList) {
        boolean state = true;
        while (state) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :\n" +
                    "1- Ürün ekle\n" +
                    "2- Ürün sil\n" +
                    "3- Ürün listele\n" +
                    "4- Filtreleme ile ürün listele\n" +
                    "0- Çıkış yap");

            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> addProduct(notebookList);
                case 2 -> removeProduct(notebookList);
                case 3 -> listProducts(notebookList);
                case 4 -> searchByFilter(notebookList);
                case 0 -> state = false;
                default -> System.out.println("Yanlış tuşlama yaptınız !");
            }
        }
    }

    public void addProduct(HashMap<Integer, NoteBook> notebookList)
    {
        System.out.print("Lütfen ürünün adını giriniz: ");
        String name=scan.nextLine();

        Brand ourBrand=null;
        boolean state=true;

        while(state)
        {
            System.out.print("Lütfen (sistemde kayıtlı ürünlerden) ürünün markasını giriniz: ");
            String brandOfProduct=scan.nextLine();
            for (Brand brand:Brand.ourBrands)
            {
                if (brand.getName().equals(brandOfProduct))
                {
                    ourBrand=brand;
                    state=false;
                }
            }
        }

        System.out.print("Lütfen ürünün ekran boyutunu giriniz: ");
        double screenSize=scan.nextDouble();

        System.out.print("Lütfen ürünün hafıza kapasitesinin giriniz: ");
        int memory=scan.nextInt();

        System.out.print("Lütfen ürünün ram miktarını giriniz: ");
        int ram=scan.nextInt();

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        int price=scan.nextInt();

        System.out.print("Lütfen ürünün stok adedini giriniz: ");
        int quantity=scan.nextInt();

        System.out.print("Lütfen ürünün indirim oranını giriniz ");
        int discountRate=scan.nextInt();


        NoteBook newNotebook = new NoteBook(name, price, discountRate, quantity,memory, ram, screenSize, ourBrand );
        notebookList.put(newNotebook.getId(), newNotebook);

    }

    public void removeProduct(HashMap<Integer, NoteBook> notebookList) {
        System.out.println("Silmek istediğiniz ürünün id'sini giriniz.");
        int id = scan.nextInt();

        if (notebookList.containsKey(id)) {
            System.out.println("Bu id değerine sahip bir ürün yoktur !");
        } else {
            System.out.println(id + "ID numaralı ürün silinmiştir !");
            notebookList.remove(id);
        }
    }

    public void listProducts(HashMap<Integer, NoteBook> notebookList) {
        String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-16s | %-22s |\n";
        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
        for (NoteBook noteBook: notebookList.values())
        {
            System.out.format(format, noteBook.getId(), noteBook.getName(), noteBook.getBrandOfProduct().getName(), noteBook.getScreenSize(), noteBook.getMemory(), noteBook.getRam(), noteBook.getPrice(), noteBook.getQuantity(), noteBook.getDiscountRate());
            System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
        }
    }

    public void searchByFilter(HashMap<Integer, NoteBook> notebookList)
    {
        System.out.println("Filtrele: "); scan.nextLine();
        String filter=scan.nextLine();

        if (filter.matches("\\d+"))
        {
            int  productFilter=Integer.parseInt(filter);
            if (notebookList.containsKey(productFilter))
            {
                NoteBook noteBook=notebookList.get(productFilter);
                String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-22s | %-16s |\n";
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                System.out.format(format, noteBook.getId(), noteBook.getName(), noteBook.getBrandOfProduct().getName(), noteBook.getScreenSize(), noteBook.getMemory(), noteBook.getRam(), noteBook.getPrice(), noteBook.getQuantity(), noteBook.getDiscountRate());
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
            }
            else
            {
                System.out.println("Bu id numarasına sahip ürün bulunamadı");
            }
        }
        else if(filter.matches("\\D+"))
        {
            if (notebookList.values().stream().anyMatch(p->p.getBrandOfProduct().getName().equals(filter)))
            {
                for (NoteBook noteBook:notebookList.values())
                {
                    if (noteBook.getBrandOfProduct().getName().equals(filter))
                    {
                        String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                        System.out.format(format, noteBook.getId(), noteBook.getName(), noteBook.getBrandOfProduct().getName(), noteBook.getScreenSize(), noteBook.getMemory(), noteBook.getRam(), noteBook.getPrice(), noteBook.getQuantity(), noteBook.getDiscountRate());
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                    }
                }
            }
            else
            {
                System.out.println("Belirtilen marka ile eşleşen bir ürün bulunamadı");
            }

        }
        else
        {
            System.out.println("Filtreleme id veya markaya göre yapılıyor lütfen bu değerlerden birini giriniz");
        }
    }
}