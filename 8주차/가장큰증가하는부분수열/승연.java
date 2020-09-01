import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            dp[i] = arr[i];
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(dp[i]<dp[j]+arr[i]&&arr[i]>arr[j]){
                    dp[i]=dp[j]+arr[i];
                }
            }
        }
        int answer =0;
        for(int i=0;i<N;i++){
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);
    }
}
