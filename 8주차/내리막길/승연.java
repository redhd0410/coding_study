import java.util.*;
class Main{
    static int N;
    static int M;
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        visited = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
                visited[i][j]=-1;
            }
        }
        int answer = dfs(N-1,M-1);
        System.out.println(answer);
    }
    public static int dfs(int x,int y){
        if(x==0&&y==0){
            return 1;
        }
        if(visited[x][y]==-1){
            visited[x][y]=0;
            for(int i=0;i<4;i++){
                int newx = x+dx[i];
                int newy = y+dy[i];
                if(newx>=0&&newx<N&&newy>=0&&newy<M){
                    if(arr[newx][newy]>arr[x][y]){
                        visited[x][y]+=dfs(newx,newy);
                    }
                }
            }
        }
        return visited[x][y];
    }
}
