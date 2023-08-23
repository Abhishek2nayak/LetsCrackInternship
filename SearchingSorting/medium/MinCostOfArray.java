package SearchingSorting.medium;

import java.util.Arrays;

public class MinCostOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 100, 101 };
        System.out.println(getMinCost2(arr, arr.length));
    }

    // using ternary operator
    public static int getMinCost(int[] arr, int n) {
        int low, high;
        low = high = 0;

        // finding min and max index from array

        for (int i = 1; i < n; i++) {
          if(low > arr[i]) low = arr[i];
          if(high < arr[i]) high = arr[i];
        }

        while ((high - low) > 2) {
            // taking two mid

            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            int cost1 = computeCost(arr, n, mid1);
            int cost2 = computeCost(arr, n, mid2);

            if (cost1 < cost2) {
                high = mid2;
            } else {
                low = mid1;
            }

        }

        return computeCost(arr, n, (low + high) / 2);

    }

    private static int computeCost(int[] arr, int n, int mid) {
        int cost = 0;
        for(int i = 0; i < n; i++) {
            cost += Math.abs(arr[i] - mid);
        }
        return cost;
    }



    //after sorting array
    public static int getMinCost2(int[] arr , int n) {
        Arrays.sort(arr);

        int mid;

        if(n % 2 == 0) {
            mid = (arr[n/2] + arr[(n-2)/2])/2;
        } else {
            mid = arr[n/2];
        }
        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost += Math.abs(arr[i] - mid);
        }

        return cost;

    }
}
