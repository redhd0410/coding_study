import java.util.*;
class Main{
    static int N;
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        visited = new int[N][N];
        int max_height = Integer.MIN_VALUE;
        int min_height = Integer.MAX_VALUE;
        int max_count = 1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
                max_height = Math.max(max_height,arr[i][j]);
                min_height = Math.min(min_height,arr[i][j]);
            }
        }
        for(int h = min_height;h<=max_height;h++){
            int count =0;
            init_visited();
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(arr[i][j]>h&&visited[i][j]==0){
                        visited[i][j]=1;
                        count++;
                        dfs(i,j,h);
                    }
                }
            }
            max_count = Math.max(max_count,count);
        }
        System.out.println(max_count);
    }
    static void init_visited(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                visited[i][j]=0;
            }
        }
    }
    static void dfs(int x,int y,int h){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<N&&newy>=0&&newy<N){
                if(arr[newx][newy]>h&&visited[newx][newy]==0){
                    visited[newx][newy]=1;
                    dfs(newx,newy,h);
                }
        
            }
        }
    }
}
