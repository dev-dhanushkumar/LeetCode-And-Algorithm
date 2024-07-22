import java.util.*;

public class StarHashCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        // char[]  arr = new char[n];
        sc.close();
        
        int starCount = 0, hashCount = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == '*') {
                starCount++;
            }else if(str.charAt(i)== '#') {
                hashCount++;
            }
        }

        System.out.println("Star Count: "+ starCount);
        System.out.println("Hash Count: "+ hashCount);

    }
}
