import java.util.*;

class Gcd{

  public int findGcd(int num1,int num2) {
    if(num2 == 0){
      return num1;
    }
    return findGcd(num2, num1 % num2);
  }


  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    sc.close();
    Gcd g = new Gcd();
    int gcd = g.findGcd(num1, num2);
    System.out.println("GCD of Two Numbers: "+ gcd);
    System.out.println("LCM of Two Numbers: "+ (num1 * num2)/gcd);

  }
}
