import java.util.*;
class Main{
    static int[] arr = {1,5,10,50};
    static int[] visited = new int[1001];
    static int N;
    static int ans = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dfs(0,0,0);
        System.out.println(ans);
    }
    public static void dfs(int index,int cnt , int total){
        if(cnt==N){
            if(visited[total]==0){
                visited[total]=1;
                ans++;
            }
            return;
        }
        for(int i=index;i<4;i++){
            dfs(i,cnt+1,total+arr[i]);
        }
    }
}
