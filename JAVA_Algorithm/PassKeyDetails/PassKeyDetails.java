import java.util.*;
class PassedKeyDetails {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstName = sc.nextLine();
    String lastName = sc.nextLine();
    int pin = sc.nextInt();
    int n = sc.nextInt();
    PassedKeyDetails ps = new PassedKeyDetails();
    ///System.out.println(ps.createPassKey(firstName, lastName));
    //System.out.println(ps.digitTraverse(pin,n));

    String result = ps.swapCase(ps.createPassKey(firstName,lastName)+ps.digitTraverse(pin,n));
    System.out.println(result);


  }

  public String createPassKey(String str1, String str2) {

    String lastLetter = new String(" ");
   if(str1.length() < str2.length()) {
      lastLetter = str1.substring(str1.length() - 1) + str2;
    } else {
      lastLetter = str2.substring(str2.length() -1) + str1;
    }

    return (lastLetter);

  }

  public String digitTraverse(int pin, int n) {
    String st2 = new String(" ");
    String st1 = Integer.toString(pin);
    int len = st1.length();
    System.out.println(len);
    if(st1.length() > n) {
      st2 = st1.substring(n-1,n);
      st2 += st1.substring(len - n,(len - n +1));
    }

    return st2; 

  }

  public String swapCase(String str) {
    StringBuilder res =  new StringBuilder();
    for(char c : str.toCharArray()){
      if( Character.isUpperCase(c)){
        res.append(Character.toLowerCase(c));
      } else if( Character.isLowerCase(c)){
        res.append(Character.toUpperCase(c));
      } else {
        res.append(c);
      }
    }

    return res.toString();
  }

}
