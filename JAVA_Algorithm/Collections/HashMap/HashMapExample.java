import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Dhanush", 100);
    map.put("Raj", 189);
    map.put("Kumar",123);

    if(map.containskey("Raj")){
      System.out.println("Raj");
    }

    System.out.println(map);
  }
}
