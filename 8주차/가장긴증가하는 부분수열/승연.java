import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int answer =0;
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        for(int i=1;i<N;i++){
            int num  = arr[i];
            for(int j =0;j<i;j++){
                if(num>arr[j]&&dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        for(int i=0;i<N;i++){
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);
    }
}
