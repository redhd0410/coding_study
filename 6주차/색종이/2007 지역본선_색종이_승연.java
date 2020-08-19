import java.util.*;
class Main{
    static int[][] arr = new int[101][101];
    static int[][] visited = new int[101][101];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int k=0;k<N;k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=x;i<x+10;i++){
                for(int j=y;j<y+10;j++){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(arr[i][j]==1&&visited[i][j]==0){
                    visited[i][j]=1;
                    count++;
                    dfs(i,j);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x,int y){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<101&&newy>=0&&newy<101){
                if(visited[newx][newy]==0&&arr[newx][newy]==1){
                    visited[newx][newy]=1;
                    count++;
                    dfs(newx,newy);
                }
            }
        }
    }
}
