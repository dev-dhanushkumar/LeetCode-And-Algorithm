

public class MaximumSubArray {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(5);
        // list.add(1);
        // list.add(-3);
        // list.add(4);
        // list.add(-1);
        // list.add(2);
        // list.add(1);
        // list.add(-5);
        // list.add(4);
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(arr.length);
        int res = maximumSumSubArray(arr);
        System.out.println(res);
    }

    private static int maximumSumSubArray(int[] list) {
        if(list.length == 1) {
            return list[0];
        }
        int sum_val = list[0];
        int sum = 0;
        for(int i = 0; i < list.length-1; i++) {
            if(list[i] > 0)
                sum += list[i];
            for(int j = i+1; j < list.length; j++) {
                if(list[i] < 0 && list[i+1] < 0) {
                    sum += Math.max(list[i], list[i+1]);
                }else {
                    sum += list[j];
                }
                if(sum > sum_val) {
                    sum_val = sum;
                }
            }
            sum = 0;
        }

        return sum_val;
    }
}