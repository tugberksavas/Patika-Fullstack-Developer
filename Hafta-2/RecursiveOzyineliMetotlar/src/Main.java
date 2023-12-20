public class Main {

   static int f(int x){
       int result = 0;
       for (int i =1 ; i<=x; i++){
           result += i;
       }


        return result;
   }

   static int r(int n){
       System.out.println(n);
       if (n==1){
           return 1;
       }

       return r(n-1)+n;
   }

    public static void main(String[] args) {
        r(10);
        //f(1) = 1
        //f(2) = 1+2
        //f(3) = 1+2+3
        //f(4) = 1+2+3+4

        //f(n) = f(n-1)+n;






    }
}