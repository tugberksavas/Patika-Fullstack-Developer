import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.print("Bir index giriniz: ");
        int index = scanner.nextInt();


        try {
            System.out.println("Dizinin " + index + ". elemanı: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin boyutunu aştınız! (0-9) Arasinda Deger Giriniz. ");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }finally {
            scanner.close();
        }
    }
}