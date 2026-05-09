import java.util.*;

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            for (int i = top; i <= bottom; i++) {
                list.add(grid[i][left]);
            }

            for (int j = left + 1; j <= right; j++) {
                list.add(grid[bottom][j]);
            }

            for (int i = bottom - 1; i >= top; i--) {
                list.add(grid[i][right]);
            }

            for (int j = right - 1; j > left; j--) {
                list.add(grid[top][j]);
            }

            int size = list.size();
            int rotate = k % size;
            int index = (size - rotate) % size;

            for (int i = top; i <= bottom; i++) {
                grid[i][left] = list.get(index % size);
                index++;
            }

            for (int j = left + 1; j <= right; j++) {
                grid[bottom][j] = list.get(index % size);
                index++;
            }

            for (int i = bottom - 1; i >= top; i--) {
                grid[i][right] = list.get(index % size);
                index++;
            }

            for (int j = right - 1; j > left; j--) {
                grid[top][j] = list.get(index % size);
                index++;
            }
        }

        return grid;
    }
}