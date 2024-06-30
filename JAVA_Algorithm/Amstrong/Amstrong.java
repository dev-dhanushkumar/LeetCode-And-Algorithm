import java.util.*;

class Amstrong{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = num;
    int sum = 0;
    while(num > 0){
      int rem = num % 10;
      sum += (rem*rem*rem);
      num /= 10;
    }
    System.out.println("Sum value: "+ sum);
    if(sum == n){
      System.out.println("Given Number is Amstrong");
    } else {
      System.out.println("Given Number is not Amstrong Numbers");
    }


  }
}
