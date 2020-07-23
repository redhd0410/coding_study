import java.util.*;
class Main{
    static int[][] arr;
    static int[][] visited;
    static int[][] melt;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int N;
    static int M;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr=new int[N+1][M+1];
        visited=new int[N+1][M+1];
        melt=new int[N+1][M+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();   
            }
        }
        int count = 0;
        int year = 0;
        while(true){
            count =0;//빙산의 분리되어있는지를 파악하는 변수
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j]!=0&&visited[i][j]==0){
                        visited[i][j]=1;
                        dfs(i,j);
                        count++;
                    }
                }    
            }
            if(count==0){//빙산의 분리없이 한번에 녹는 경우
                System.out.println("0");
                break;
            }else if(count>=2){
                System.out.println(year);
                break;
            }
            year++;//count가 1인 경우 즉, dfs돌린 후에도 아직 한덩어리인 경우
            melting();//dfs를 돌리고 난 후 녹는 빙산의 높이를 업데이트
        }
    }
    static void dfs(int x,int y){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<N&&newy>=0&&newy<M&&visited[newx][newy]==0){
                if(arr[newx][newy]==0){
                    melt[x][y]++;
                }//동서남북중 한곳이 바닷물과 인접해있으면 녹음
                if(arr[newx][newy]!=0){
                    visited[newx][newy]=1;
                    dfs(newx,newy);
                }
            }
        }
    }
    static void melting(){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]-=melt[i][j];
                if(arr[i][j]<0){
                    arr[i][j]=0;
                }//빙산의 높이가 음수인경우 0으로 초기화
                melt[i][j]=0;
                visited[i][j]=0;
            }
        }
    }
}