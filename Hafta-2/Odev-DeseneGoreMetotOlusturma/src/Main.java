import java.util.Scanner;

public class Main {
    static void calculate(int n) {
        // Base case: Sayı 0 veya negatif olduğunda işlemi sonlandır
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        // İleri doğru işlem: 5 çıkar ve ekrana yazdır
        System.out.print(n + " ");
        calculate(n - 5);

        // Geriye doğru işlem: 5 ekler ve ekrana yazdır
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number = scan.nextInt();
        calculate(number);
    }
}