import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //İlk önce matrisi oluşturuyoruz.
        int[][] matrix = {
                {2,3,4},
                {5,6,4}
        };
        //Transpoz matrisi oluşturuyoruz.
        int[][] transpose = new int[matrix[0].length][matrix.length];

        //Matrisin transpozunu alıyoruz.
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];     //Transpoz matrisinin i. satırı ve j. sütunu; matrisin j. satırı ve i. sütununa eşit oluyor.
            }
        }
        //Matrisi ve transpozunu yazdırıyoruz.
        System.out.println("Matris: ");
        for (int[] row : matrix) {                  //Matrisin satırlarını yazdırıyoruz.
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Transpoze: ");
        for (int[] row : transpose) {               //Transpozun satırlarını yazdırıyoruz.
            System.out.println(Arrays.toString(row));
        }
    }
}