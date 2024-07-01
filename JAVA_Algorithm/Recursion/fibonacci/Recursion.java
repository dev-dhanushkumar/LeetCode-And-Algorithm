import java.util.*;

class Recursion {
  
  static int fib(int n) {
   if(n <= 1)  {
      return n;
    }

    int last = fib(n-1);
    int slast = fib(n-2);

    return last + slast;
  }

  public static void main(String[] args) {
    System.out.println("Welcomw to Fibonocci series");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    System.out.println(fib(N));
  }
}
