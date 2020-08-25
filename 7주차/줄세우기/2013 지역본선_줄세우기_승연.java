/*
    가장 긴 증가수열 활용
*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int max =0;
        int[] dp = new int[N+1];
        for(int i=0;i<N;i++){
            int num = arr[i];
            dp[num] = dp[num-1]+1;
            max = Math.max(max,dp[num]);
        }
        System.out.println(N-max);
    }
}
