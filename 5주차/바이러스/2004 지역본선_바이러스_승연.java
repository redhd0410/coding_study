import java.util.*;
class Main{
    static int[][] arr;
    static int[] visited;
    static int N;
    static int M;
    static int count;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N+1][N+1];
        visited = new int[N+1];
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
        visited[1]=1;
        dfs(1);
        System.out.println(count);
    }
    public static void dfs(int start){
        for(int i=1;i<=N;i++){
            if(visited[i]!=1&&arr[start][i]==1){
                visited[i]=1;
                count++;
                dfs(i);
            }
        }
    }
}
