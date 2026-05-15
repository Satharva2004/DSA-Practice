class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char curr = board[row][col];
                if(curr == '.') continue;
                for(int j = col + 1; j < 9; j++){
                    if(curr == board[row][j]){
                        return false;
                    }
                }
                for(int i = row + 1; i < 9; i++){
                    if(curr == board[i][col]){
                        return false;
                    }
                }
            }
        }
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char curr = board[row][col];
                if(curr == '.') continue;
                int startrow = (row/3)*3;
                int startcol = (col/3)*3;
                for(int i = startrow; i < startrow+3; i++){
                    for(int j = startcol; j < startcol+3; j++){
                        if(i == row && j == col) continue;
                        if(curr == board[i][j]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}