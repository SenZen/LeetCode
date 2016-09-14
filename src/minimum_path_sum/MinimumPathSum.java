package minimum_path_sum;

public class MinimumPathSum {
//	Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//
//	Note: You can only move either down or right at any point in time.
    public static int minPathSum(int[][] grid) {
        //greedy is not working
//    	return pathFinder(0, 0, grid, grid[0][0]);
    	
    	// should be dynamic programming
    	int[][] temp = new int[grid.length][grid[0].length];
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(i == 0 && j == 0) temp[i][j] = grid[i][j];
				else if(i == 0) temp[i][j] = temp[i][j - 1] + grid[i][j];
				else if(j == 0) temp[i][j] = temp[i - 1][j] + grid[i][j];
				else temp[i][j] = Math.min(temp[i][j - 1], temp[i - 1][j]) + grid[i][j];
				}
		}
    	
    	return temp[grid.length - 1][grid[0].length - 1];
    }
    
    public static int pathFinder(int x, int y, int[][] grid, int count) {
    	
    	if(x == grid[0].length - 1 && y == grid.length - 1) return count + grid[y][x];
    	
    	if(x == grid[0].length - 1) return count + pathFinder(x, y + 1, grid, grid[y + 1][x]);
    	if(y == grid.length - 1) return count + pathFinder(x + 1, y, grid, grid[y][x + 1]);
    	
    	if(grid[y + 1][x] >= grid[y][x + 1]) return count + pathFinder(x + 1, y, grid, grid[y][x + 1]);
    	else return count + pathFinder(x, y + 1, grid, grid[y + 1][x]);
    }
}
