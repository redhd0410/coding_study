import java.util.*;
class Main{
    static class Dot{
        int x;
        int y;
        Dot(int x,int y){
            this.x =x;
            this.y =y;
        }
    }
    static int[][] arr;
    static int[][] visited;
    static int N;
    static int M;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N+1][M+1];
        visited = new int[N+1][M+1];
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1) count++;
            }
        }
        int time=0;
        while(true){
            bfs();
            time++;
            boolean flag = false;
            int tmp_cnt=0;
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j]!=0){
                        flag = true;
                        tmp_cnt++;
                    }
                }
            }
            if(flag==false){
                break;
            }
            count= tmp_cnt;
            visited = new int[N+1][M+1];
        }
        System.out.println(time);
        System.out.println(count);
    }
    static void bfs(){
        Queue<Dot> q = new LinkedList<>();
        q.offer(new Dot(0,0));
        while(!q.isEmpty()){
            Dot dot = q.remove();
            int x = dot.x;
            int y = dot.y;
            for(int i=0;i<4;i++){
                int newx = x+dx[i];
                int newy = y+dy[i];
                if(newx>=0&&newx<N&&newy>=0&&newy<M){
                    if(visited[newx][newy]!=1){
                        if(arr[newx][newy]==1){//치즈있음
                            visited[newx][newy]=1;
                            arr[newx][newy]=0;
                        }else{
                            visited[newx][newy]=1;
                            q.offer(new Dot(newx,newy));
                        }
                    }
                }
            }
        }
    }
}