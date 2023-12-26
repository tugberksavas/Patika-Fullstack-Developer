import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //İlk önce listeyi oluşturuyoruz.
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20,};
        //Tekrar sayılarını tutacak bir dizi oluşturuyoruz.
        int[] frequency = new int[list.length];
        //Tekrar sayılarını tutacak dizinin elemanlarını -1 yapıyoruz.
        int repeated = -1;


        for (int i = 0; i < list.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < list.length; j++) {
                //Eğer i. eleman j. elemana eşitse ve daha önce tekrar sayılarını tutan dizide bulunmuyorsa
                if (list[i] == list[j]) {
                    counter++;                  //Tekrar sayısını bir arttırıyoruz.
                    frequency[j] = repeated;    //Tekrar sayılarını tutan dizinin j. elemanını -1 yapıyoruz.
                }
            }
            //Tekrar sayılarını tutan dizinin i. elemanı -1 değilse
            if (frequency[i] != repeated) {     //Tekrar sayılarını tutan dizinin i. elemanını counter yapıyoruz.
                frequency[i] = counter;
            }
        }
        //Diziyi ve tekrar sayılarını yazdırıyoruz.
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları ");


        for (int i = 0; i < frequency.length; i++) {        //Tekrar sayılarını tutan dizinin i. elemanı -1 değilse
            if (frequency[i] != repeated) {                 //Tekrar sayılarını tutan dizinin i. elemanını yazdırıyoruz.
                System.out.println(list[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}