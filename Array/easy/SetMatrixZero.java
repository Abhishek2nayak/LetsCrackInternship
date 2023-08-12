package Array.easy;

import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        if (2 * (matrix.length * matrix[0].length) == list.size())
            return;
        int idx = 0;
        while (idx < list.size() && !list.isEmpty()) {
            int r = list.get(idx++);
            int c = list.get(idx++);
            int i = 0;
            while (i < matrix[0].length) {
                matrix[r][i] = 0;
                i++;
            }
            i = 0;
            while (i < matrix.length) {
                matrix[i][c] = 0;
                i++;
            }
        }

    }
}