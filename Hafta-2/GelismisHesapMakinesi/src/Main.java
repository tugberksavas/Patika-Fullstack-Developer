import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("cıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("carpma: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("bolme: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod (int a,int b){
        return a%b;
    }

    static void calc(int a,int b){
        System.out.println("Cevresi: "+ (2*(a+b)));
        System.out.println("Alan: "+ (a*b));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplamaa\n"
                + "2- Cıkarma\n"
                + "3- Carpma\n"
                + "4- Bolme\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdortgen Alan ve Cevre Hesabi"
                + "8- Cıkıs Yap";


        System.out.println(menu);
        while (true) {

            System.out.print("bir islem seciniz: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("ilk sayi girin: ");
            int a = scan.nextInt();
            System.out.print("ikinci sayi girin: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("ikinci sayi 0dan farkli olmali ");
                    }
                    break;
                case 5:
                    System.out.println("us hesabı" + power(a,b));
                    break;
                case 6:
                    System.out.println("mod islemi"+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("gecersiz bir islem girdiniz");

            }

        }
        System.out.println("güle güle");


    }
}