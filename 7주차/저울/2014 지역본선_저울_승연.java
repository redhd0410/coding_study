import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][N+1];
        int[][] checked = new int[N+1][N+1];
        int[] visited = new int[N+1];
        int[] answer = new int[N+1];
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]=1;
            checked[a][b]=1;
            checked[b][a]=1;
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i=1;i<=N;i++){
            Arrays.fill(visited,0);
            q.offer(i);
            visited[i]=1;
            while(!q.isEmpty()){
                int now = q.remove();
                for(int j=1;j<=N;j++){
                    if(arr[now][j]==1&&visited[j]==0){
                        checked[i][j]=1;
                        q.offer(j);
                        visited[j]=1;
                    }   
                }
            }
        }
        for(int i=1;i<=N;i++){
            Arrays.fill(visited,0);
            q.offer(i);
            visited[i]=1;
            while(!q.isEmpty()){
                int now = q.remove();
                for(int j=1;j<=N;j++){
                    if(arr[j][now]==1&&visited[j]==0){
                        checked[i][j]=1;
                        q.offer(j);
                        visited[j]=1;
                    }   
                }
            }
        }
        for(int i=1;i<=N;i++){
            int cnt =1;
            for(int j=1;j<=N;j++){
                if(checked[i][j]==1){
                    cnt++;
                }
            }
            answer[i] = N-cnt;
        }
        for(int i=1;i<=N;i++){
            System.out.println(answer[i]);
        }
    }
}
