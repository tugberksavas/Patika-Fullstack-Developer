import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Kaç elemanlı bir dizi oluşturmak istiyorsunuz: ");
        int n = input.nextInt();

        //Dizi oluşturuluyor
        int[] list = new int[n];
        //Dizinin elemanları kullanıcıdan alınıyor
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = input.nextInt();
        }

        //Dizinin sıralanmamış hali yazdırılıyor
        Arrays.sort(list);
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(list));


    }
}