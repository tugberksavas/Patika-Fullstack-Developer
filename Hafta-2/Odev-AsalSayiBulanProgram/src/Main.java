import java.util.Scanner;

public class Main {

    static int asal(int a, int b) {
        if (a <= 1) {
            System.out.println(a + "  asal sayi degildir");
        } else if (b == 1) {
            System.out.println(a + "asal bir sayidir");
        } else {
            if (a % b == 0) {
                System.out.println(a + " asal bir sayi degildir....");
            } else {
                asal(a, b - 1);
            }
        }
        return a;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextByte();


            if (number <= 0) {
                System.out.println("Lütfen pozitif bir sayı giriniz.");
            } else {
                asal(number, number / 2);
                if (number == 17) {
                    System.out.println("Doğru tahmin!");
                    break;
                }

            }
        }


    }
}