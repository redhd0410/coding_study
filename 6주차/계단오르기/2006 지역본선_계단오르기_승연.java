import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[301];
        int[] dp = new int[301];
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        dp[0]=0;
        dp[1] = arr[1];
        dp[2] = Math.max(dp[1]+arr[2],arr[2]);
        dp[3] = Math.max(dp[1]+arr[3],arr[2]+arr[3]);
        for(int i=4;i<=N;i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
            //연속으로 한칸씩은 움직일 수 없으므로
        }
        System.out.println(dp[N]);
    }
}
