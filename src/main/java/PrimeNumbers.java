public class PrimeNumbers {
    public static void practice(int maxNumber) {

       for (int i=2; i<=maxNumber; i++){
           for (int j=2; j<=i; j++){

               if (i==j) {
                   System.out.print(" " + i);
               }

               if (i%j==0){
                   break;
               }

           }
       }
    }
}