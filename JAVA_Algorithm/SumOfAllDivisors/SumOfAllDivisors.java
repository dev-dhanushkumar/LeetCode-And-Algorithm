import java.util.*;

class SumOfAllDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    long sum = 0;


    for(int i = 1; i <= num; i++){
      sum += (num / i) * i;
      System.out.println(sum);
    }
    //for(int i = 1; i <= num; i++){
      //long divisor = i;
      //for(int j = 1; j <= i/2; j++ ){
        //if(i % j == 0){
          //divisor += j;
        //}
      //}

      //sum += divisor;
    //}

    System.out.println("sum of Divisors: "+ sum);
  }
}
