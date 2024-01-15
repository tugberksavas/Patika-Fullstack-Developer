import java.util.HashMap;
import java.util.Scanner;

public class PhoneServices {
    Scanner scan = new Scanner(System.in);

    public void run(HashMap<Integer, Phone> PhoneList) {
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
                case 1 -> addPhone(PhoneList);
                case 2 -> deletePhone(PhoneList);
                case 3 -> listPhone(PhoneList);
                case 4 -> searchByFilter(PhoneList);
                case 0 -> state = false;
                default -> System.out.println("Yanlış tuşlama yaptınız !");
            }
        }
    }

    public void addPhone(HashMap<Integer, Phone> phoneList)
    {
        System.out.print("Lütfen ürünün adını giriniz: "); scan.nextLine();
        String productName=scan.nextLine();

        Brand ourBrand=null;
        boolean state=true;

        while(state)
        {
            System.out.print("Lütfen (sistemde kayıtlı ürünlerden) ürünün markasını giriniz: "); scan.nextLine();
            String brandOfProduct=scan.nextLine();
            for (Brand brand: Brand.ourBrands)
            {
                if (brand.getName().equals(brandOfProduct))
                {
                    ourBrand=brand;
                    state=false;
                } else {
                    System.out.print("Listede olmayan bir marka girdiniz !");
                }
            }


        }

        System.out.print("Lütfen ürünün ekran boyutunu giriniz: ");
        double screenSize=scan.nextDouble();

        System.out.print("Lütfen ürünün batarya gücünü giriniz: ");
        double batteryPower=scan.nextDouble();

        System.out.print("Lütfen ürünün hafıza kapasitesinin giriniz: ");
        int memory=scan.nextInt();

        System.out.print("Lütfen ürünün ram miktarını giriniz: ");
        int ram=scan.nextInt();

        System.out.print("Lütfen ürünün rengini giriniz ");scan.nextLine();
        String color=scan.nextLine();

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        int price=scan.nextInt();

        System.out.print("Lütfen ürünün stok adedini giriniz: ");
        int quantity=scan.nextInt();

        System.out.print("Lütfen ürünün indirim oranını giriniz ");
        int discountRate=scan.nextInt();


        Phone newPhone = new Phone(productName, price, discountRate, quantity, memory, ram, screenSize, ourBrand, color, batteryPower);
        phoneList.put(newPhone.getId(), newPhone);
    }

    public void deletePhone(HashMap<Integer, Phone> phoneList) {
        System.out.println("Silmek istediğiniz ürünün id'sini giriniz.");
        int id = scan.nextInt();

        if (phoneList.containsKey(id)) {
            System.out.println("Bu id değerine sahip bir ürün yoktur !");
        } else {
            System.out.println(id + "ID numaralı ürün silinmiştir !");
            phoneList.remove(id);
        }
    }

    public void listPhone(HashMap<Integer, Phone> phoneList) {
        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        for (Phone phone:phoneList.values())
        {
            System.out.format(format, phone.getId(), phone.getName(), phone.getBrandOfProduct().getName(), phone.getScreenSize(), phone.getBatteryPower(), phone.getMemory(), phone.getRam(), phone.getColor(), phone.getPrice(), phone.getQuantity(), phone.getDiscountRate());
            System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        }
    }

    public void searchByFilter(HashMap<Integer, Phone> phoneList)
    {
        System.out.println("Filtrele: "); scan.nextLine();
        String filter=scan.nextLine();

        if (filter.matches("\\d+"))
        {
            int  phoneFilter=Integer.parseInt(filter);
            if (phoneList.containsKey(phoneFilter))
            {
                Phone phone=phoneList.get(phoneFilter);
                String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format(format, phone.getId(), phone.getName(), phone.getBrandOfProduct().getName(), phone.getScreenSize(), phone.getBatteryPower(), phone.getMemory(), phone.getRam(), phone.getColor(), phone.getPrice(), phone.getQuantity(), phone.getDiscountRate());
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
            }
            else
            {
                System.out.println("Bu id numarasına sahip ürün bulunamadı");
            }


        }
        else if(filter.matches("\\D+"))
        {
            if (phoneList.values().stream().anyMatch(p->p.getBrandOfProduct().getName().equals(filter)))
            {
                for (Phone phone:phoneList.values())
                {
                    if (phone.getBrandOfProduct().getName().equals(filter))
                    {
                        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format(format, phone.getId(), phone.getName(), phone.getBrandOfProduct().getName(), phone.getScreenSize(), phone.getBatteryPower(), phone.getMemory(), phone.getRam(), phone.getColor(), phone.getPrice(), phone.getQuantity(), phone.getDiscountRate());
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
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