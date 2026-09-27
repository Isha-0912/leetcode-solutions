class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-26-08                                             #
        #                                                                       #
        #########################################################################
        */
    List<List<String>> ans = new ArrayList<>();
    HashSet<Integer> column = new HashSet<>();
    HashSet<Integer> posdiag = new HashSet<>();
    HashSet<Integer> negdiag = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] b = new char[n][n];
        for (char[] i : b)
            Arrays.fill(i, '.');
        func(0, b, n);
        return ans;
    }
    public void func(int row, char[][] b, int n) {
        if (row == n) {
            List<String> k = new ArrayList<>();
            for (char[] i : b)
                k.add(new String(i));
            ans.add(k);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (column.contains(col) || posdiag.contains(row + col) || negdiag.contains(row - col))
                continue;
            column.add(col);
            posdiag.add(row + col);
            negdiag.add(row - col);
            b[row][col] = 'Q';
            func (row + 1, b, n);
            b[row][col] = '.';
            column.remove(col);
            posdiag.remove(row + col);
            negdiag.remove(row - col);
        }
    }
}