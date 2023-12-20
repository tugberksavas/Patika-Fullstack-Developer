import java.util.Scanner;

public class Main {

    static int us(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * us(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;


        while (true) {


            System.out.print("Taban Degerini Giriniz: ");
            int a = input.nextInt();
            System.out.print("Us Degerini Giriniz: ");
            int b = input.nextInt();

            result = us(a, b);
            System.out.println(a + " uzeri " + b + " = " + result);

            if (result == 0) {
                System.out.println("***");
                break;
            }


        }


    }
}