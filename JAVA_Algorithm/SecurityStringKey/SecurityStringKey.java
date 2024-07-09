import java.util.*;

public class SecurityStringKey {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    SecurityStringKey s = new SecurityStringKey();
    
    ArrayList<String> word1 = s.splitString(s1);
    ArrayList<String> word2 = s.splitString(s2);
    System.out.println(word1);
    System.out.println(word2);

    System.out.println(word2.get(0)+word1.get(0)+word1.get(1)+word2.get(1));
    sc.close();

  }

  public ArrayList<String>  splitString(String str1) {
    ArrayList<String> list = new ArrayList<>();
    int strDiv = str1.length() / 3;
    list.add(str1.substring(0,strDiv));
    list.add(str1.substring(str1.length() - strDiv));
    list.add(str1.substring(strDiv,str1.length() - strDiv));
    return (list);

  } 
}
