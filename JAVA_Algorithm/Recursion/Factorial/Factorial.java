class Factorial {
  static long findFact(long n){
    if(n == 0) {
      return 1;
    }

    return n*findFact(n-1);
  }

  public static void main(String[] args) {
    long list = findFact(6);
    System.out.println(list);
  }
}
