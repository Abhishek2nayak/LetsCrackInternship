package SearchingSorting.easy;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    //to count the occ of digit according to given exp
    static void countSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
        Arrays.fill(count,0);
        int i;


        // store the occurance of digit in count arr 
        for( i = 0; i < arr.length; i++) {
            count[(arr[i]/exp) % 10]++;
        }

        for(i = 1; i < 10; i++) {
            count[i] += count[i -1];
        }

        for (i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for(i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int m = getMax(arr);
        for(int exp = 1; m / exp > 0; exp *=10) {
            countSort(arr, exp);
        }
    }
    
}
