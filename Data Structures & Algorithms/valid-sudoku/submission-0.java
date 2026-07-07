class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j]== '.'){
                    continue;
                }
                String row = "row"+i+'-'+board[i][j];
                String col = "col"+j+'-'+board[i][j];
                int box = (i/3)*3+ j/3;
                String boxs = "box"+box+'-'+board[i][j];
                if (set.contains(row) || set.contains(col) || set.contains(boxs)){
                    return false;
                }else {
                    set.add(row);
                    set.add(col);
                    set.add(boxs);
                }
            }
        }
        return true;
    }
}
