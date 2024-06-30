class PrintName {
  static void printName(int i,int n) {
    if(i > n) return;

    System.out.println("Dhanush");
    printName(i+1, n);
  }

  public static void main(String[] args) {
    printName(1,6);
  }
}
