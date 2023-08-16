package Array.medium;

class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] > arr2[j]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                int idx = j;

                while (idx < n - 1 && arr2[idx] > arr2[idx + 1]) {
                    // sort the array 2
                    temp = arr2[idx];
                    arr2[idx] = arr2[idx + 1];
                    arr2[idx + 1] = temp;
                    idx++;

                }

            }
            i++;

        }

        while (j < n) {
            arr1[i] = arr2[j];
            i++;
            j++;
        }

    }

}