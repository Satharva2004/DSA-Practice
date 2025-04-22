class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> map_rows = new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(map_rows.contains(board[i][j])){
                    return false;
                }
                else if(board[i][j] != '.'){
                    map_rows.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<board[0].length;i++){
            HashSet<Character> map_columns = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(map_columns.contains(board[j][i])){
                    return false;
                }
                else if(board[j][i] != '.'){
                    map_columns.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> map_box = new HashSet<>(); 
            for(int j=0;j<9;j++){
                int row = 3 * (i / 3) + j / 3;
                int col = 3 * (i % 3) + j % 3;
                if(map_box.contains(board[row][col])){
                    return false;
                }
                else if(board[row][col] != '.'){
                    map_box.add(board[row][col]);
                }
            }
        }
        return true;
    }
}


//optimized for space complexity
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> str = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int current_char = board[i][j];
                if(current_char != '.'){
                    if(!str.add(current_char + "row" + i) || !str.add(current_char + "col" + j) || !str.add(current_char + "row and col" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
