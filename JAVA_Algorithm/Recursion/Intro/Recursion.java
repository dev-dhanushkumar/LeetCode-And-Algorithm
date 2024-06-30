class Recursion {
  static int cnt = 0;
  static void print() {
    if (cnt == 3) return;
    System.out.println(cnt);
    cnt  += 1;
    
    print();
    System.out.println(cnt);
  }

  public static void main(String[] args) {
    print();
  }
}
