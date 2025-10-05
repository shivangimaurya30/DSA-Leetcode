class Solution {
    int[] [] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;int n=heights[0].length;
        boolean[] [] p=new boolean[m][n];
        boolean[] [] a=new boolean[m][n];
        
        for(int i=0;i<m;i++){
            dfs(heights,p,i,0);
            dfs(heights,a,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(heights,p,0,j);
            dfs(heights,a,m-1,j);
        }

        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(p[i][j]&& a[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }
        void dfs(int[][] heights, boolean[][] visited, int r, int c){
            int m=heights.length;
            int n=heights[0].length;
            // if(r<0||c<0||r>=m||c>=n|| visited[r][c]||heights[r][c]<prevHeight)
            // return;
            // visited[r][c]=true;
            // for(int[]d:dir){
            //     dfs(heights,visited,r+d[0],c+d[1],heights[r][c]);
            visited[r][c] = true;

        for(int[] d:dir){
            int nr = r + d[0];
            int nc = c + d[1];
            if(nr < 0 || nc < 0 || nr >= m || nc >= n) continue;
            if(visited[nr][nc]) continue;
            if(heights[nr][nc] < heights[r][c]) continue; 
            dfs(heights, visited, nr, nc);
            }
        }
    }
