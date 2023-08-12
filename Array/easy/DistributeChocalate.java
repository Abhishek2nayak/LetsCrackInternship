package Array.easy;

import java.util.Arrays;

public class DistributeChocalate {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;
        System.out.println(solution(arr, m));
    }

    static int solution(int[] arr, int m) {

        // base condition
        // if number of student is greater then number of packates
        // then return -1
        if (arr.length < m)
            return -1;

        Arrays.sort(arr); // sorting array
        int l = 0;
        int h = m - 1;
        int min = Integer.MAX_VALUE;
        while (h < arr.length) {
            int diff = arr[h] - arr[l]; // maximum diff of that continuos array
            if (diff < min)
                min = diff; // if diff < min then our new min is diff
            l++;
            h++;
        }
        return min;

    }
}
