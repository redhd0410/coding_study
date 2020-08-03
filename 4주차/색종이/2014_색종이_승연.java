import java.util.*;
class Main{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] arr = new int[101][101];
    static int[][] visited = new int[101][101];
    static int count =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] answer = new int[N+1];
        for(int i=1;i<=N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            for(int j=x;j<x+w;j++){
                for(int k = y;k<y+h;k++){
                    arr[j][k]=i;
                }
            }
        }
        for(int k=1;k<=N;k++){
            init();
            count = 0;
            for(int i=0;i<101;i++){
                for(int j=0;j<101;j++){
                    if(arr[i][j]==k&&visited[i][j]==0){
                        count++;
                        visited[i][j]=1;
                        dfs(i,j,k);
                    }
                }
            }
            answer[k] = count;
        }
        for(int i=1;i<=N;i++){
            System.out.println(answer[i]);
        }
    }
    static void init(){
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                visited[i][j]=0;
            }
        }
    }
    static void dfs(int x,int y,int num){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<101&&newy>=0&&newy<101){
                if(arr[newx][newy]==num&&visited[newx][newy]==0){
                    count++;
                    visited[newx][newy]=1;
                    dfs(newx,newy,num);
                }
            }
        }
    }
}
