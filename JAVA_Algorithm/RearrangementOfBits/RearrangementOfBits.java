package Rearrangement_of_Bits;

import java.util.*;

public class RearrangementsOfBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while(num > 0) {
            int rem = num % 2;
            list.add(rem);
            num /=2;
        }
        sc.close();
        System.out.println(list);
        list = sortingArrayList(list);
        System.out.print("After Sorting: ");
        System.out.print(list+"\n");
        System.out.println("Decimal Value: "+binaryToDecimal(list));
    }    


    // Sorting Arraylist
    static ArrayList<Integer> sortingArrayList(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size() -1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
        return arr;
    }

    static int binaryToDecimal(ArrayList<Integer> arr) {
        int pow = 0;
        int dec = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                dec += (int) Math.pow(2, pow);
                pow++;
            }
        }
        return dec;
    }
}
