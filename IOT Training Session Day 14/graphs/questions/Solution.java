package DSA.nonlinear.graphs.questions;

class Solution {
    // directions 8 top, bottom, right,left and 4 diagonals
    int[]dx={-1,-1,-1,0,0,1,1,1};
    int[]dy={-1,0,1,-1,1,-1,0,1};
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int islandCount = 0;
        // traverse each cell
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
             // if its a land and not visited do a dfs call and count
                if(grid[i][j]=='L' && !visited[i][j])
                {
                    // call a dfs from that cell and visit whole island
                    dfs(i,j,grid,visited,n,m);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    void dfs(int x,int y,char[][] grid,boolean[][]visited,int n,int m){
        visited[x][y]=true;
        // 8 direction
        for(int dir=0;dir<8;dir++){
            int newX=x+dx[dir];
            int newY=y+dy[dir];
            // make sure the values are inside the boundary
            // they should be Land's 'L' and should not be visited
            if(newX>=0 && newY>=0 && newX<n && newY<m && grid[newX][newY]=='L' && !visited[newX][newX])
            {
                dfs(newX,newY,grid,visited,n,m);
            }
        }
    }
}
