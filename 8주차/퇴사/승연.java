import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        int[] p = new int[N+1];
        int[] dp = new int[N+2];
        for(int i=1;i<=N;i++){
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
            dp[i] = p[i];
        }
        for(int i=N;i>=1;i--){
            if(i+t[i]-1>N){
                dp[i]=dp[i+1];
            }else{
                dp[i] = Math.max(dp[i+1],dp[i+t[i]]+p[i]);
            }
        }
        System.out.println(dp[1]);
    }
}
