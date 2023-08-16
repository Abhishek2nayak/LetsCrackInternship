package Array.medium;

class Solution {
    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = find(board, word, 1, i, j, n, m, '*');
                    if (ans)
                        return true;
                    System.out.println(ans);
                }

            }
        }
        return false;
    }

    public boolean find(char[][] board, String word, int idx, int r, int c, int n, int m, char history) {

        if (idx >= word.length())
            return true;
        history = board[r][c];
        char ch = word.charAt(idx);
        boolean ans = false;
        // towrds the right

        if (c < m - 1 && board[r][c + 1] == ch) {
            board[r][c] = '*';
            ans = ans | find(board, word, idx + 1, r, c + 1, n, m, history);
        }

        // towards the left
        if (c > 0 && board[r][c - 1] == ch) {
            board[r][c] = '*';
            ans = ans | find(board, word, idx + 1, r, c - 1, n, m, history);
        }

        // towards top
        if (r > 0 && board[r - 1][c] == ch) {
            board[r][c] = '*';
            ans = ans | find(board, word, idx + 1, r - 1, c, n, m, history);
        }
        if (r < n - 1 && board[r + 1][c] == ch) {
            board[r][c] = '*';
            ans = ans | find(board, word, idx + 1, r + 1, c, n, m, history);
        }

        board[r][c] = history;
        return ans;

    }
}