import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {112, 33, 7656, 9, -22, -731, 8473, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        //başlangıçta min ve max değerlerini dizinin ilk elemanı olarak atıyoruz
        int min = list[0];
        int max = list[0];

        //Girilen sayıdan küçük en yakın sayıyı bulma
        for (int i : list) {
            if (i < n) {
                min = i;
                break;
            }
        }
        //Girilen sayıdan büyük en yakın sayıyı bulma
        for (int i : list) {
            if (i > n) {
                max = i;
                break;
            }
        }

        //Dizi içindeki sayıları dolaşarak girilen sayıdan küçük en yakın sayıyı bulma
        for (int i : list) {
            if (i < n && i > min) {
                min = i;
            }
            if (i > n && i < max) {
                max = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}