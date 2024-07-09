import java.util.*;

class PrimeNum {
  static boolean checkPrime(int num) {
    int cnt = 0;

    for(int  i = 1; i <= Math.sqrt(num); i++){
      if(num % i == 0) {
        cnt = cnt + 1;

        if(num / i != i){
          cnt = cnt + 1;
        }
      }
    }

    if (cnt == 2) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    boolean isPrime = checkPrime(num);
    if(isPrime){
      System.out.println("Given Numbers is PrimeNum");
    } else {
      System.out.println("Given Number is not Prime Number");
    }
  }
}
