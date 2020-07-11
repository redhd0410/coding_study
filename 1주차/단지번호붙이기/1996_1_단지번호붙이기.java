import java.util.*;
class Main{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt = 0;
    static int[][] arr;
    static int[][] visited;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ArrayList<Integer> countList = new ArrayList<>();
        arr = new int[N+1][N+1];
        visited = new int[N+1][N+1];
        for(int i =0;i<N;i++){
            String input = sc.next();
            for(int j=0;j<N;j++){
                arr[i][j] = input.charAt(j)-'0';
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i][j]==1&&visited[i][j]!=1){
                    cnt=1;
                    visited[i][j]=1;
                    dfs(i,j);
                    countList.add(cnt);
                }
            }
        }
        Collections.sort(countList);
        System.out.println(countList.size());
        for(int i=0;i<countList.size();i++){
            System.out.println(countList.get(i));
        }
    }
    static void dfs(int x,int y){
        for(int i=0;i<4;i++){
            int newx = x+dx[i];
            int newy = y+dy[i];
            if(newx>=0&&newx<N&&newy>=0&&newy<N){
                if(arr[newx][newy]==1&&visited[newx][newy]!=1){
                    visited[newx][newy]=1;
                    cnt++;
                    dfs(newx,newy);
                }
            }
        }
    }
}