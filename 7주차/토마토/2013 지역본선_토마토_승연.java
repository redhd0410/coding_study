import java.util.*;
class Main{
    static class Tomato{
        int x;
        int y;
        int z;
        Tomato(int x,int y,int z){
            this.x =x;
            this.y =y;
            this.z =z;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[][][] arr = new int[H][N][M];
        int[][][] visited = new int[H][N][M];
        int[] dx = {-1,1,0,0,0,0};
        int[] dy = {0,0,-1,1,0,0};
        int[] dz = {0,0,0,0,-1,1};
        int notomato =0;
        int answer = 0;
        Queue<Tomato>q = new LinkedList<>();
        for(int h=0;h<H;h++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    arr[h][i][j]=sc.nextInt();
                    if(arr[h][i][j]==-1){
                        notomato++;
                    }if(arr[h][i][j]==1){
                        q.offer(new Tomato(h,i,j));
                    }
                }
            }
        }
        if(notomato==N*M*H){
            System.out.println("-1");
            return;
        }
        while(!q.isEmpty()){
            Tomato t = q.remove();
            for(int i=0;i<6;i++){
                int newx = t.x+dx[i];
                int newy = t.y+dy[i];
                int newz = t.z+dz[i];
                if(newx>=0&&newx<H&&newy>=0&&newy<N&&newz>=0&&newz<M){
                    if(arr[newx][newy][newz]==0&&visited[newx][newy][newz]==0){
                        visited[newx][newy][newz]=visited[t.x][t.y][t.z]+1;
                        q.offer(new Tomato(newx,newy,newz));
                    }
                }
            }
        }
        for(int h=0;h<H;h++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr[h][i][j]==0&&visited[h][i][j]==0){
                        System.out.println("-1");
                        return;
                    }
                    if(answer<visited[h][i][j]){
                        answer = visited[h][i][j];
                    }
                    
                }
                
            }
        }
        System.out.println(answer);
    }
}
