class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int row = boxGrid.length;
        int col = boxGrid[0].length;
        for(int r = 0; r < row; r++){
            int i = col-1;
            for(int c = col-1; c >= 0; c--){
                if(boxGrid[r][c] == '#'){
                    char temp = boxGrid[r][c];
                    boxGrid[r][c] = boxGrid[r][i];
                    boxGrid[r][i] = temp;
                    i--;
                }else if(boxGrid[r][c] == '*'){
                    i = c-1;
                }
            }
        }
        char[][] result = new char[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = row - 1; j >= 0; j--) {
                result[i][row - 1 - j] = boxGrid[j][i];
            }
        }
        return result;
    }
}