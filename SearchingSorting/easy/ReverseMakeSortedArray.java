package SearchingSorting.easy;

public class ReverseMakeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 10, 9, 8};  
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[]arr) {
      
        int low = 0;
        int high = arr.length -1;
        //finding left most unsorted array index
        while(low < high && arr[low] < arr[low + 1]) low++;
        //finding rightmost unsorted array index
        while(high < low && arr[high] > arr[high -1]) high--;

        //already sorted array
        if(low >= high) return true;

        //otherwise sort the unsorted portion of array
        sort(arr, low, high);

        if(low != 0) low--;
        if(high != arr.length -1) high++;
        //check again if array become sorted or not
        while(low < high && arr[low] < arr[low + 1]) low++;
        if(low == high) return true;
        return false;

    }
    public static void sort(int[] arr, int l , int h) {
        while(l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
}
