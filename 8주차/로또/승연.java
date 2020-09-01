import java.util.*;
class Main{
    static int[] arr;
    static int[] visited = new int[6];
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            N = sc.nextInt();
            if(N==0) return;
            arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            dfs(0,0);
            Arrays.fill(visited,0);
            System.out.println();
        }
    }
    public static void dfs(int start,int count){
        if(count==6){
            for(int i=0;i<6;i++){
                System.out.print(visited[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<N;i++){
            visited[count] = arr[i];
            dfs(i+1,count+1);
        }
    }
}
