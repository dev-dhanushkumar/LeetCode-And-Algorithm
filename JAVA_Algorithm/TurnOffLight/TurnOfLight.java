package Trun_off_Light;

import java.util.Scanner;

class TurnOfLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String bulbs = sc.nextLine();
        sc.close();
        System.out.println(findMinimumI(n, k, bulbs));
    }

    private static int findMinimumI(int n, int k, String bulbs) {
        int right = 1, left = n;

        while (left < right) {
            int mid = left + (right - left) /2;
            if(canTurnOffAll(n, k, bulbs, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canTurnOffAll(int n, int k, String bulbs, int mid) {
        int operations = 0;
        int i = 0;

        while (i < n) {
            if(bulbs.charAt(i) == '1') {
                operations++;
                if(operations > k) {
                    return false;
                }
                i += mid;
            } else {
                i++;
            }
        }
        return true;
    }
}
