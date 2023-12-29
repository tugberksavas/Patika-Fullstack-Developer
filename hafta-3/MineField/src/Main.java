import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the number of rows mine fields: ");
            int createRow = scanner.nextInt();
            System.out.println("Please enter the number of columns mine fields: ");
            int createCol = scanner.nextInt();

            if (createRow < 2 || createCol < 2) {
                System.out.println("Cannot create mine field under 2x2 size ");
            } else {

                MineSweeper mineSweeper = new MineSweeper(createRow, createCol);
                mineSweeper.runGame();
                break;
            }

        }
    }
}