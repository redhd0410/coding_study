import java.util.*;
class Main{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] arr;
    static int[][] visited;
    static int N;
    static int M;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int t = 0;t <T;t++){
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();
            arr = new int[N+1][M+1];
            visited = new int[N+1][M+1];
            int count =0;
            for(int i=0;i<K;i++){
                int x= sc.nextInt();
                int y= sc.nextInt();
                arr[y][x]=1;
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j]==1&&visited[i][j]==0){
                        count++;
                        visited[i][j]=1;
                        dfs(i,j);
                    }
                }
            }
            answer[t] =count;
        }
        for(int i=0;i<T;i++){
            System.out.println(answer[i]);
        }
    }
    public static void dfs(int x,int y){
        for(int i =0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<N&&newy>=0&&newy<M){
                if(arr[newx][newy]==1&&visited[newx][newy]==0){
                    visited[newx][newy]=1;
                    dfs(newx,newy);
                }
            }
        }
    }
}
