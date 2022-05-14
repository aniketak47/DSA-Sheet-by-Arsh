// https://www.geeksforgeeks.org/find-number-of-islands/
    import java.util.*;
    import java.io.*;
    class Main {
        public static void main(String[] args) throws IOException {
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            while (T-- > 0) {
                int n = scn.nextInt();
                int m = scn.nextInt();
                char[][] grid = new char[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        grid[i][j] = scn.next().charAt(0);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.numIslands(grid);
                System.out.println("No. of Island : "+ans);
            }
        }
    }
    
    
    class Solution {
        // Function to find the number of islands.
        public int numIslands(char[][] grid) {
            // Code here
            int count = 0;
            
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1'){
                        count++;
                        dfs(grid,i,j);
                    }
                }
            }
            
            return count;
        }
        
        private void dfs(char[][] grid,int row,int col){
            if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0'){
                return;
            }
            
            grid[row][col]='0';
            
            dfs(grid,row-1,col);
            dfs(grid,row,col-1);
            dfs(grid,row+1,col);
            dfs(grid,row,col+1);
            
            //  Here below code is for geeksforgeeks for diagonally for leetcode these below code is not written 
            dfs(grid, row+1, col+1);
            dfs(grid, row+1, col-1);
            dfs(grid, row-1, col-1);
            dfs(grid, row-1, col+1);
        }
    }