import java.util.*;
class Main{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
            
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[][] visited;
        int[][] dist;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            String str = sc.next();
            for(int j=0;j<M;j++){
                if(str.charAt(j)=='L'){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==1){
                    visited = new int[N][M];
                    dist = new int[N][M];
                    Queue<Point> q = new LinkedList<>();
                    q.add(new Point(i,j));
                    visited[i][j]=1;
                    while(!q.isEmpty()){
                        Point point = q.remove();
                        int x = point.x;
                        int y = point.y;
                        for(int k=0;k<4;k++){
                            int newx = x+dx[k];
                            int newy = y+dy[k];
                            if(newx>=0&&newx<N&&newy>=0&&newy<M){
                                if(arr[newx][newy]==1&&visited[newx][newy]==0){
                                    q.add(new Point(newx, newy));
                                    visited[newx][newy]=1;
                                    dist[newx][newy] = dist[x][y]+1;
                                }
                            }
                        }
                    }
                    for(int k=0;k<N;k++){
                        for(int z=0;z<M;z++){
                            ans = Math.max(ans,dist[k][z]);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
