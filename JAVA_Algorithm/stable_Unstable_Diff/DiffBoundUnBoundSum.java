import java.util.*;



class DiffBoundUnBoundSum {
  public static void main(String[] args) { 
    Scanner sc  =  new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
    int n5 = sc.nextInt();
    DiffBoundUnBoundSum diffSum = new DiffBoundUnBoundSum();
    int diff = diffSum.diffDigit(n1, n2, n3, n4, n5);
    System.out.println("Return Value:" + diff);
  }



  public int diffDigit(int n1,int n2, int n3, int n4, int n5) {
    int bount = 0;
    int unbount = 0;
    int diff = 0;
    int[] inputarg = {n1 , n2 , n3 , n4, n5};
    String[] input = Arrays.stream(inputarg)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new);
    int idx = 0;

    for(String num : input) {
      int[] digitCount = new int[10];

      for(char digit : num.toCharArray()) {
        digitCount[digit - '0']++;
      }

      boolean isBound = true;
      int firstNonZeroCount = 0;
      for(int count : digitCount){
        if(count > 0) {
          if(firstNonZeroCount == 0) {
            firstNonZeroCount = count;
          } else if(count != firstNonZeroCount) {
            isBound = false;
            break;
          }
        }
      }

      if(isBound) {
        bount += inputarg[idx];
      } else {
        unbount += inputarg[idx];
      }
      idx++;
    }
    System.out.println("Bount Sum: " + bount);
    System.out.println("Unbount Sum: " + unbount);
    diff = unbount - bount;
    return diff;
  
  }
}


