import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] visited = new int[N+1][N+1];
        int ans=0;
        for(int i=0;i<M;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            visited[p][q]=1;
            visited[q][p]=1;
        }
        for(int i=1;i<=N-2;i++){
            for(int j=i+1;j<=N-1;j++){
                if(visited[i][j]==1) continue;
                for(int k=j+1;k<=N;k++){
                    if(visited[i][k]==1||visited[j][k]==1) continue;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
