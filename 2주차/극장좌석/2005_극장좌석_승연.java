import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int vipcnt = sc.nextInt();
        int[] dp = new int[N+2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=N;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        int current =0;
        int answer =1;
        for(int i=0;i<vipcnt;i++){
            int vip = sc.nextInt();
            answer*=dp[vip - current-1];
            current =vip;
        }
        answer*=dp[N-current];
        System.out.println(answer);
    }
}