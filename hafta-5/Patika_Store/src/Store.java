import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);

    NotebookServices notebookServices = new NotebookServices();
    PhoneServices phoneServices = new PhoneServices();

    public void run() {
        boolean state = true;
        while (state) {
            System.out.println("============ PATİKA STORE ==============");

            System.out.println(
                    "1- Notebook İşlemleri\n" +
                            "2- Cep Telefonu İşlemleri\n" +
                            "3- Marka listeleme\n" +
                            "0- Çıkış");

            System.out.print("Lütfen yapacağınız işlemi seçiniz :");
            int choice = scan.nextInt();
            System.out.println("Seçiminiz :" + choice);
            System.out.println("----------------------");
            switch (choice) {
                case 1 -> notebookServices.run(NoteBook.ourNoteBooks);
                case 2 -> phoneServices.run(Phone.ourPhones);
                case 3 -> listToBrand();
                case 0 -> state = false;
            }

        }

    }

    public void listToBrand()
    {
        for (Brand brand:Brand.ourBrands)
        {
            System.out.println("Marka adı: "+brand.getName());
            System.out.println("Marka Id: "+brand.getId());
            System.out.println("=========================");
        }
    }
}