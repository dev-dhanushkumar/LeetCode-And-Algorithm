class SumOFCubeSeries {
  static long sumOfSeries(int n){
    if(n == 0){
      return 0;
    }
    long sum = n * n * n;
    return sum+sumOfSeries(n-1);
  }

  public static void main(String[] args) {
    long sol = sumOfSeries(5);
    System.out.println("Sum of Series: " + sol);
  }
}
