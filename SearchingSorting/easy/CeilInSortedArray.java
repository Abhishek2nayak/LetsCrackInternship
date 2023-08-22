package SearchingSorting.easy;

public class CeilInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        helper(arr, 0);
        helper(arr, 1);
        helper(arr, 5);
        helper(arr, 20);
    }

    public static void helper(int[] arr, int x) {
        
        int l = 0;
        int h = arr.length -1;
        while(l <= h) {
            int m = l + (h -l)/ 2;
            if(arr[m] == x) {
                System.out.println("Floor : " + arr[m] + " Ceil : " + arr[m]);
                break;
            } else if(arr[m] > x) {
                h = m -1;
            } else {
                l = m + 1;
            }
        }

        if(h == -1 ) {
            System.out.println("no floor");
            System.out.println("Ceil  "+arr[l] );
            return;
        }
         if(l == arr.length) {
            System.out.println("no ceil");
            System.out.println("floor  "+arr[h] );
            return;
        }

        System.out.println(arr[l] + " " + arr[h]);


    }
}
