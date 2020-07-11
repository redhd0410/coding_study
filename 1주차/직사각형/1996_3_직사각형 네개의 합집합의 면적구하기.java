import java.util.*;
class Main{
    static int[][] arr = new int[102][102];
    static int[][] visited = new int[101][101];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<4;i++){
            int lx =sc.nextInt();
            int ly =sc.nextInt();
            int rx =sc.nextInt();
            int ry =sc.nextInt();
            for(int j=lx;j<rx;j++){
                for(int k = ly;k<ry;k++){
                    arr[j][k]=1;
                }
            }
        }
        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++){
                if(arr[i][j]==1&&visited[i][j]!=1){
                    visited[i][j]=1;
                    dfs(i,j);
                }
            }
        }
        System.out.println(cnt);
    }
    static void dfs(int x,int y){
        cnt++;
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(arr[newx][newy]==1&&visited[newx][newy]!=1){
                visited[newx][newy]=1;
                dfs(newx,newy);
            }
        }
    }
}